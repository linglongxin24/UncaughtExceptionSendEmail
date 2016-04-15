package com.kejiang.yuandl.uncaughtexceptionsendemail;

import android.app.Application;

import com.kejiang.yuandl.mylibrary.CustomActivityOnCrash;

/**
 * Created by yuandl on 2016/4/7 0007.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CustomActivityOnCrash.install(this);
        CustomActivityOnCrash.setDebugMode(true);
    }
}
