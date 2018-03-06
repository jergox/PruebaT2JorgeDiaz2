package com.example.usuariodam.pruebat2jorgediaz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Typeface face=Typeface.createFromAsset(getAssets(),"fonts//AmaticSC-Regular.ttf");
    EditText mr_fox;
    EditText caja;
    ImageView imagen_fox;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        //¿Porque no va?
        Intent intent = new Intent(this, ActivitySplash.class);
        startActivity(intent);*/

        //fuentes
        /*mr_fox = findViewById(R.id.tv_MrFox);
        caja = findViewById(R.id.textView);

        mr_fox.setTypeface(face);
        caja.setTypeface(face);
        */
        //fuentes

        //circularView

        imagen_fox = findViewById(R.id.iv_fox);

        Drawable originalDrawable = getResources().getDrawable(R.drawable.fox);
        Bitmap originalBitmap = ((BitmapDrawable) originalDrawable).getBitmap();

        RoundedBitmapDrawable roundedDrawable =
                RoundedBitmapDrawableFactory.create(getResources(), originalBitmap);

        imagen_fox.setImageDrawable(roundedDrawable);
        //circularView
    }
}
