package com.example.emptyfieldtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    public RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindUI();

        radioButton.setError("Error!");
    }

    public void bindUI() {
        radioButton = findViewById(R.id.radioButton);
    }
}
