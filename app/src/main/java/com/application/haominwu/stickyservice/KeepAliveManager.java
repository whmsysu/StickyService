package com.application.haominwu.stickyservice;

import android.content.Intent;
import android.content.IntentFilter;

public class KeepAliveManager {
    private static KeepAliveManager instance = new KeepAliveManager();
    public static KeepAliveManager getInstance() {
        return instance;
    }

}
