package com.example.thread26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 : Khoi tao ra thread

//        TaskThread taskThread = new TaskThread();
//        taskThread.run();
//        Thread thread = new Thread(new RunableWork());
//        thread.start();
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d("BBB","Runnable runing");
            }
        });
        thread.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("BBB",thread.getState().toString());
            }
        },1000);
    }

}
