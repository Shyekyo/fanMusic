package com.example.fanmusic.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.fanmusic.R;

import java.util.Timer;
import java.util.TimerTask;

public class WelconmeActivity extends BaseActivity {
//1:延迟三秒 2:跳转页面
    private Timer mTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welconme);
        init();
    }

    private void init(){
        mTimer = new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                //Log.e("welcomeActivity","threadName : " + Thread.currentThread().getName())
                toLogin();
            }
        },3*1000);
    }

    /**
     * 跳转到mainactit
     */
    private  void toMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        fileList();
    }
    /**
     * 跳转到loginactit
     */
    private  void toLogin(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        fileList();
    }
}
