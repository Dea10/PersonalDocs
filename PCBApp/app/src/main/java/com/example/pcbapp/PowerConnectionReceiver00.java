package com.example.pcbapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.util.Log;

public class PowerConnectionReceiver00 extends BroadcastReceiver {

    private final String TAG = PowerConnectionReceiver00.class.getName();

    @Override
    public void onReceive(Context context, Intent intent) {

        IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent batteryStatus = context.registerReceiver(null, ifilter);

        // Are we charging / charged?
        int status = batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
        boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL;

        if(isCharging) {
            Log.d(TAG, "CHARGING");
        } else {
            Log.d(TAG, "NOT CHARGING");
        }

    }
}

/*
* This BroadcastReceiver seems to have trouble with the POWER ACTIONS.
* It always returns a != CHARGING status (Not necessarily a NOT CHARGING status)
*
* Although, this broadcast was tested in an Android 9 device (Galaxy Note 10)
* and the device is not reporting a CHARGING/NOT CHARGING status. I guess it's
* associated with the SDK initial config.
* */
