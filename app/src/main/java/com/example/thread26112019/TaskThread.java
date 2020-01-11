package com.example.thread26112019;

import android.util.Log;

public class TaskThread extends Thread {
    @Override
    public void run() {
        super.run();
        Log.d("BBB","Thread running");
    }
}
