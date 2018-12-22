package com.gsww.www.accountbook.utils;

import android.util.Log;

/**
 * 自定义Log类
 */
public class L {
    public static final Boolean IS_DEBUG = true;
    public static final String TAG = "ACCOUNTSBOOK";
    public static void e(String message){
        Log.e(TAG, "e: "+message );
    }

}
