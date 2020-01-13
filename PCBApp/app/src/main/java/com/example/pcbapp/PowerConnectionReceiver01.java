package com.example.pcbapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class PowerConnectionReceiver01 extends BroadcastReceiver {

    private final String TAG = PowerConnectionReceiver01.class.getName();

    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();

        if(action.equals(Intent.ACTION_POWER_CONNECTED))
        {
            Log.d(TAG, "CHARGING");
        }
        else if(action.equals(Intent.ACTION_POWER_DISCONNECTED))
        {
            Log.d(TAG, "NOT CHARGING");
        }

    }
}

/*
 * This BroadcastReceiver seems to have work fine with the POWER ACTIONS.
 *
 * Although, this broadcast was tested in an Android 9 device (Galaxy Note 10)
 * and the device is not reporting a CHARGING/NOT CHARGING status. I guess it's
 * associated with the SDK initial config.
 * */