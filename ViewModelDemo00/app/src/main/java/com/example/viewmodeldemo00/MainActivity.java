package com.example.viewmodeldemo00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textViewCounter;
    public Button buttonAdd;

    public Integer counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindUI();
        setCounter();
    }

    public void bindUI() {
        textViewCounter = findViewById(R.id.mainTextViewCounter);
        buttonAdd = findViewById(R.id.mainButtonAdd);
    }

    public void addONe(View view) {
        counter++;
        setCounter();
    }

    public void setCounter() {
        textViewCounter.setText(String.valueOf(counter));
    }
}
