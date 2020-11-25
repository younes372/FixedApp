package com.example.fixedapp.utils;

import android.os.Handler;
import android.os.Message;

public class RefreshHandler extends Handler {
    @Override
    public void handleMessage(Message msg) {

    }

    public void sleep(long delayMillis) {
        this.removeMessages(0);
        sendMessageDelayed(obtainMessage(0), delayMillis);
    }
};