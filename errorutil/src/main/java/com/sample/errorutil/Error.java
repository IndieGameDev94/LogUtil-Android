package com.sample.errorutil;

import android.util.Log;

/**
 * Created by Dev-01 on 8/29/2017.
 */

public class Error {
    public static final String TAG = "ErrorTag";

    public static void e(String message) {
        Log.e(TAG, message);
    }
}
