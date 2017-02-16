package com.gardion.gardionclient.utils;

import android.util.Log;

/**
 * Logging methods used throughout application.
 */
public class LogUtils {

    private static final String TAG = "Gardion";

    /**
     * @param message to be logged
     */
    public static void LOGD(String message) {
        if (Log.isLoggable(TAG, Log.DEBUG)) {
            Log.d(TAG, message);
        }
    }

    /**
     * @param message to be logged
     */
    public static void LOGE(String message) {
        Log.e(TAG, message);
    }

}
