package com.example.viewmodeldemo00;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textViewCounter;
    public Button buttonAdd;
    public Button buttonMove;

    public ViewModelCounter mViewModel;

    public final static String EXTRA_MAIN_STRING = "EXTRA_MAIN_STRING";
    public final static String EXTRA_MAIN_BOOLEAN = "EXTRA_MAIN_BOOLEAN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mViewModel = ViewModelProviders.of(this).get(ViewModelCounter.class);
        //mViewModel = new ViewModelProvider(this, ViewModelCounter.class);
            // Class ViewModelProviders deprecated
        mViewModel = new ViewModelProvider(this).get(ViewModelCounter.class);

        bindUI();
        setCounter(mViewModel.getCounter());
    }

    public void bindUI() {
        textViewCounter = findViewById(R.id.mainTextViewCounter);
        buttonAdd = findViewById(R.id.mainButtonAdd);
        buttonMove = findViewById(R.id.mainButtonMove);
    }

    public void addONe(View view) {
        mViewModel.setCounter(mViewModel.getCounter() + 1);
        setCounter(mViewModel.getCounter());
    }

    public void setCounter(Integer counter) {
        textViewCounter.setText(String.valueOf(counter));
    }

    public void goToSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
            // send EXTRA
        intent.putExtra(EXTRA_MAIN_STRING, "MainActivity msj");
        intent.putExtra(EXTRA_MAIN_BOOLEAN, true);

        startActivity(intent);
    }
}
