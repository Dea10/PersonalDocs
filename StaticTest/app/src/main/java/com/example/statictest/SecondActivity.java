package com.example.statictest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private final static String TAG = SecondActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        SCContactList contactList = SCContactList.getInstance();

        for(int i = 0; i < SCContactList.personList.size(); i++) {
            Log.d(TAG, "Name: " + contactList.personList.get(i).getPersonName());
            Log.d(TAG, "Age: " + contactList.personList.get(i).getPersonAge());
        }
    }
}
