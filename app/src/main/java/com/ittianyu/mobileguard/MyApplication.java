package com.ittianyu.mobileguard;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by fuli.niu on 2016/11/3.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        if (LeakCanary.isInAnalyzerProcess(this)) {
//            // This process is dedicated to LeakCanary for heap analysis.
//            // You should not init your app in this process.
//            return;
//        }
        LeakCanary.install(this);
        // Normal app init code...
    }
}
