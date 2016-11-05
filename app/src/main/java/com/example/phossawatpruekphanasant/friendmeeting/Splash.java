package com.example.phossawatpruekphanasant.friendmeeting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by phossawatpruekphanasant on 11/5/2016 AD.
 */

public class Splash extends Activity {
    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashh);
        logo = (ImageView)findViewById(R.id.imageView);
        logo.setImageDrawable(getResources().getDrawable(R.drawable.logo));
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent myIntent = new Intent(Splash.this,MainActivity.class);
                    startActivity(myIntent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        };
        myThread.start();


    }
}
