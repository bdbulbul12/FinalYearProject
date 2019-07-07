package com.programmerhuntbd.bulbul.nuhelpdesk.SplashScreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

import com.programmerhuntbd.bulbul.nuhelpdesk.MainActivity;
import com.programmerhuntbd.bulbul.nuhelpdesk.R;

public class MySplashScreen extends AppCompatActivity {

    ProgressBar progressBar;
    private int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_my_splash_screen);

        progressBar= (ProgressBar) findViewById(R.id.splashProgressId);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                doWork();
                startApp();

            }
        });

        thread.start();


    }

    private void startApp() {

        Intent intent = new Intent(MySplashScreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void doWork() {

        for (progress=20;progress<=100;progress=progress+20){
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
