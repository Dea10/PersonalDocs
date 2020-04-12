package com.example.livedatademo00;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    public EditText editTextNumber;
    public Button buttonSend;

    public ViewModelRandom viewModelRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModelRandom = new ViewModelProvider(this).get(ViewModelRandom.class);

        bindUi();

        suscribe();
    }

    public void bindUi() {
        textView = findViewById(R.id.mainTextView);
        editTextNumber = findViewById(R.id.mainEditTextNumber);
        buttonSend = findViewById(R.id.mainButtonSend);
    }

    public void sendInteger(View view) {
        String aux = editTextNumber.getText().toString();
        Integer integer = Integer.parseInt(aux);
        viewModelRandom.setIntegerReceived(integer);
    }

    public void suscribe() {
        final Observer<Integer> integerObserver = new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                String newText = integer.toString();
                textView.setText(newText);
            }
        };

        viewModelRandom.getInteger().observe(this, integerObserver);
    }
}
