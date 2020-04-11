package com.example.viewmodeldemo00;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textViewCounter;
    public Button buttonAdd;

    public ViewModelCounter mViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewModel = ViewModelProviders.of(this).get(ViewModelCounter.class);

        bindUI();
        setCounter(mViewModel.getCounter());
    }

    public void bindUI() {
        textViewCounter = findViewById(R.id.mainTextViewCounter);
        buttonAdd = findViewById(R.id.mainButtonAdd);
    }

    public void addONe(View view) {
        mViewModel.setCounter(mViewModel.getCounter() + 1);
        setCounter(mViewModel.getCounter());
    }

    public void setCounter(Integer counter) {
        textViewCounter.setText(String.valueOf(counter));
    }
}
