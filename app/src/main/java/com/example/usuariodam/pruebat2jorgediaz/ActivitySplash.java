package com.example.usuariodam.pruebat2jorgediaz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Usuario DAM on 06/03/2018.
 */

public class ActivitySplash extends AppCompatActivity implements Animation.AnimationListener {
    ImageView imagen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_splash);



        //imagen = (ImageView) findViewById(R.id.imagen);
        imagen = (ImageView) findViewById(R.id.imageView2);
        Animation animate = AnimationUtils.loadAnimation(this, R.anim.rotate_animatio1);
        imagen.startAnimation(animate);
        //imagen.setAnimationListener(this);

        /*imagen = (ImageView) findViewById(R.id.imagen);
        Animation animate = AnimationUtils.loadAnimation(this, R.anim.rotate_animatio1);
        Thread timerTread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Splash.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerTread.start();
    }*/
        TextView texto;
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(ActivitySplash.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    /*private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
    }}, 500);}*/

}