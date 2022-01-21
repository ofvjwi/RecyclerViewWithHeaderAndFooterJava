package com.example.project3;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {
    private final String TAG = MyApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }
}
