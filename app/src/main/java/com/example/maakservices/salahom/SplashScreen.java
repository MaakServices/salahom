package com.example.maakservices.salahom;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Amey on 08-04-2018.
 */

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        System.out.println("In Splash Screen Activity");
        StartAnimations();

        new Handler().postDelayed(new Runnable() {
            // Using handler with postDelayed called runnable run method
            @Override
            public void run() {
                System.out.println("sessionManager.isLoggedIn()" );
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);

                finish();
            }
        }, 3500);
    }

    private void StartAnimations() {

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.splashImageView);
        iv.clearAnimation();
        iv.startAnimation(anim);

    }
}
