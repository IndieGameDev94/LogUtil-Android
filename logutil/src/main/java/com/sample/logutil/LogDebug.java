package com.sample.logutil;

import android.util.Log;

/**
 * Created by Dev-01 on 8/29/2017.
 */

public class LogDebug {

    private final static String TAG = "LogDebug";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
