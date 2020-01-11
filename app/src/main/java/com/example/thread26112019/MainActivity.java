package com.example.thread26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int a , b , c;
    Laco laco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = b = c =0;
        laco = new Laco(0);
        // 1 : Khoi tao ra thread
        //2 : Quan ly luong theo object
        // a : 1
        // b : 1
        // c : a + b
        Thread threada = new Thread(new Runnable() {
            @Override
            public void run() {
               for (int i = 0 ; i <= 50 ; i++){
                   a = i;
                   Log.d("BBB", "A " + a);
               }
            }
        });

        Thread threadb = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i <= 50 ; i++){
                    b = i;
                    Log.d("BBB", "B " + b);
                }
            }
        });
        Thread threadc = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i <= 50 ; i++){
                    c =  a + b;
                    Log.d("BBB", "C " + c);
                }
            }
        });

        threada.start();
        threadb.start();
        threadc.start();


    }
    // lam cho 1 thread ket thuc thi thread kia moi start
    // Deadlock
//    public synchronized void runningThread(String key){
//        for (int i = 0 ; i <= 10000 ; i++){
//            Log.d("BBB", key + " " + i);
//        }
//    }

}
