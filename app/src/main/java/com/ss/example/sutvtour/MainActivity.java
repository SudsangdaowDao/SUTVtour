package com.ss.example.sutvtour;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView) findViewById(R.id.image);
        image.setBackgroundResource(R.drawable.rotation_android);

        AnimationDrawable anim = (AnimationDrawable) image.getBackground();
        anim.start();
    }
}
