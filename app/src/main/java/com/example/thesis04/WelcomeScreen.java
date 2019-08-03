package com.example.thesis04;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeScreen extends AppCompatActivity {

    TextView letsFlow;
    ImageView bgSplash, buttonShape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        Typeface riffic = Typeface.createFromAsset(getAssets(),"fonts/RifficFree-Bold.ttf");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        letsFlow = (TextView) findViewById(R.id.letsFlow);
        bgSplash = (ImageView) findViewById(R.id.bgSplash);
        buttonShape = (ImageView) findViewById(R.id.buttonShape);

        letsFlow.setTypeface(riffic);

        buttonShape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ax = new Intent(WelcomeScreen.this,MainActivity.class);
                startActivity(ax);
                finish();
            }
        });
    }
}
