package com.example.viewmodeldemo00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public TextView textViewString;
    public TextView textViewBoolean;
    public Button buttonSetDisplay;

    public String stringMsj = "noStringMsj";
    public Boolean booleanMsj = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //get Extra
        stringMsj = getIntent().getStringExtra(MainActivity.EXTRA_MAIN_STRING);
        booleanMsj = getIntent().getBooleanExtra(MainActivity.EXTRA_MAIN_BOOLEAN, false);

        bindUI();

        buttonSetDisplay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDisplay();
            }
        });

        setDisplay();
    }

    public void bindUI() {
        textViewString = findViewById(R.id.secondTextViewString);
        textViewBoolean = findViewById(R.id.secondTextViewBoolean);
        buttonSetDisplay = findViewById(R.id.secondButtonSetDisplay);
    }

    public void setDisplay() {
        textViewString.setText(stringMsj);
        textViewBoolean.setText(booleanMsj.toString());
    }
}
