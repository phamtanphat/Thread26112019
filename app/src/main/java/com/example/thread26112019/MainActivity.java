package com.example.thread26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 : Khoi tao ra thread
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
//            }
//        });
//        thread.start();
//        TaskThread taskThread = new TaskThread();
//        taskThread.run();
        Thread thread = new Thread(new RunableWork());
        thread.start();
    }

}
