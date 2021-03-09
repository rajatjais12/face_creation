package com.example.shweta.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class ShowResult extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);
        ImageView i1= (ImageView) findViewById(R.id.imageView4);
        //i1.setImageResource(R.drawable.image0);
        Button b2= (Button) findViewById(R.id.button2);
        Random rand = new Random(10);

// Obtain a number between [0 - 49].
        int n = rand.nextInt(9);
        n += 1;
        switch (n){
            case 0:
                i1.setImageResource(R.drawable.image0);
                break;
            case 1:
                i1.setImageResource(R.drawable.image1);
                break;
            case 2:
                i1.setImageResource(R.drawable.image2);
                break;
            case 3:
                i1.setImageResource(R.drawable.image3);
                break;
            case 4:
                i1.setImageResource(R.drawable.image4);
                break;
            case 5:
                i1.setImageResource(R.drawable.image5);
                break;
            case 6:
                i1.setImageResource(R.drawable.image6);
                break;
            case 7:
                i1.setImageResource(R.drawable.image7);
                break;
            case 8:
                i1.setImageResource(R.drawable.image8);
                break;
            case 9:
                i1.setImageResource(R.drawable.image9);
                break;



        }

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(ShowResult.this,Home.class);
                startActivity(i2);
                finish();
            }
        });


    }
}
