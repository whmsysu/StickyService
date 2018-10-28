package com.application.haominwu.stickyservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompleteReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            HooliganActivity. startHooligan();
        } else if(intent.getAction().equals(Intent.ACTION_SCREEN_ON)){
            HooliganActivity. killHooligan();
        }
    }
}
