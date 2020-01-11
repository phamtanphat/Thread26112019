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
        Thread threada = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i <= 10 ; i++){
                    Log.d("BBB", "A " + i);
                }
            }
        });

        Thread threadb = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i <= 10 ; i++){
                    Log.d("BBB", "B " + i);
                }
            }
        });
        threada.start();
        threadb.start();

    }

}
