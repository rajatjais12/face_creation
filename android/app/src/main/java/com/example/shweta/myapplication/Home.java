package com.example.shweta.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static com.example.shweta.myapplication.R.drawable.eye;

public class Home extends Activity {
Activity ctx=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageButton img1= (ImageButton) findViewById(R.id.eye);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ctx, eyeClick.class);
                startActivity(i1);
            }

        });
        ImageButton img2= (ImageButton) findViewById(R.id.eyebrow);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ctx, EyeBrowClick.class);
                startActivity(i1);
            }

        }); ImageButton img3= (ImageButton) findViewById(R.id.lips);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(ctx, lipsclick.class);
                startActivity(i2);
            }

        }); ImageButton img4= (ImageButton) findViewById(R.id.nose);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ctx, NoseClick.class);
                startActivity(i1);
            }

        });
    }
}
