package com.application.haominwu.stickyservice;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

public class StickServiceApplication extends Application {

    private static StickServiceApplication mcontext;

    @Override
    public void onCreate() {
        super.onCreate();
        mcontext = this;
        Logger.addLogAdapter(new AndroidLogAdapter());

        //Add broadcast receiver
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        registerReceiver(new BootCompleteReceiver(),filter);

        //Add service
        Intent serviceIntent = new Intent(this, MyService.class);
        startService(serviceIntent);
    }

    public static Context getAppContext(){
        return mcontext;
    }
}
