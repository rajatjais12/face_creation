package com.example.shweta.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import static android.R.attr.description;
import static android.R.attr.targetActivity;
import static android.R.attr.value;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static com.example.shweta.myapplication.EyeBrowClick.LoadImageFromWebOperations;
import static com.example.shweta.myapplication.R.drawable.image4;
import static com.example.shweta.myapplication.R.drawable.right_eyebrow_str;
import static com.example.shweta.myapplication.R.id.imageView;
import static com.example.shweta.myapplication.R.id.progressBar;

public class finalActivity extends Activity {
    String desc;
    String desc2;
    String desc3;
    String desc4;

    public static final String MyPREFERENCES = "MyPrefs";
    private ProgressBar pgBar;
    private int i = 0;
    private TextView txtView;
    private Handler hdlr = new Handler();
    SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;
    int imageRes1=5;
    int imageRes2=6;
    int imageRes3=7;
    int imageRes4=7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Intent intent = getIntent();
        // String image_path = getIntent().getStringExtra("Image");
        final SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        editor = sharedPreferences.edit();

        String receive = intent.getStringExtra("eyebrow");
        Log.d("tag4", "Value: " + receive);
        //int receivedImage = intent.getIntExtra("image",0);
        //imageView.setImageResource(receivedImage);
        //   Drawable d = LoadImageFromWebOperations(image_path);
        Bundle extras = getIntent().getExtras();
        //dec = extras.getString("id");
        imageRes1 = extras.getInt("id1");
         imageRes2 = extras.getInt("id2");
         imageRes3 = extras.getInt("id3");
        imageRes4 = extras.getInt("id4");


        pgBar = (ProgressBar) findViewById(progressBar);

        ImageView imageView = (ImageView) findViewById(R.id.im1);
        ImageView imageView2 = (ImageView) findViewById(R.id.im2);
        ImageView imageView3 = (ImageView) findViewById(R.id.im3);
        final ImageView imageView4 = (ImageView) findViewById(R.id.im4);

        //  img1.setImageResource(R.drawable.right_eyebrow_angled);

        if ("meyebrow".equals(receive)) {


            editor.putInt("key1", imageRes1);
            editor.commit();

        }

         imageRes1 = sharedPreferences.getInt("key1", 0);



            Log.d("tag3", "Value: " + imageRes1);
            if (imageRes1 == 0) {

                imageView.setImageResource(R.drawable.right_eyebrow_angled);

                //   img1.setImageResource(R.drawable.left_eye_almond);
            }
            if (imageRes1 == 1) {

                imageView.setImageResource(R.drawable.right_eyebrow_round);

            }
            if (imageRes1 == 2) {

                imageView.setImageResource(R.drawable.right_eyebrow_round);


            }
            if (imageRes1 == 3) {

                imageView.setImageResource(R.drawable.right_eyebrow_round);

            }


         else if ("myLips".equals(receive)) {
                imageRes1 = extras.getInt("id2");

                editor.putInt("key2", imageRes2);
                editor.commit();
            }

        imageRes2 = sharedPreferences.getInt("key2", 0);

            if (imageRes2 == 0) {

                imageView2.setImageResource(R.drawable.lipfull);

                //   img1.setImageResource(R.drawable.left_eye_almond);
            }
            if (imageRes2 == 1) {

                imageView2.setImageResource(R.drawable.lipround);

            }
            if (imageRes2 == 2) {

                imageView2.setImageResource(R.drawable.lipthin);


            }
            if (imageRes2 == 3) {

                imageView2.setImageResource(R.drawable.lipwide);

            }



             else if ("mynose".equals(receive)) {
                imageRes3 = extras.getInt("id3");

                editor.putInt("key3", imageRes3);
                editor.commit();}

        imageRes3 = sharedPreferences.getInt("key3", 0);

                Log.d("tag3", "Value: " + imageRes1);
                if (imageRes3 == 0) {

                    imageView3.setImageResource(R.drawable.nose_wide);

                    //   img1.setImageResource(R.drawable.left_eye_almond);
                }
                if (imageRes3 == 1) {

                    imageView3.setImageResource(R.drawable.crooked);

                }
                if (imageRes3 == 2) {

                    imageView3.setImageResource(R.drawable.nose_long);


                }
                if (imageRes3 == 3) {

                    imageView3.setImageResource(R.drawable.nose_short);

                }
                else if ("myeye".equals(receive)) {
                    imageRes4 = extras.getInt("id4");

                    editor.putInt("key4", imageRes4);
                    editor.commit();}
        imageRes4 = sharedPreferences.getInt("key4", 0);


        if (imageRes4 == 0) {

            imageView4.setImageResource(R.drawable.left_eye_monolid);

            //   img1.setImageResource(R.drawable.left_eye_almond);
        }
        if (imageRes4 == 1) {

            imageView4.setImageResource(R.drawable.left_eye_almond);

        }
        if (imageRes4 == 2) {

            imageView4.setImageResource(R.drawable.left_eye_round);


        }
        if (imageRes4 == 3) {

            imageView4.setImageResource(R.drawable.left_eye_upturned);

        }


            Button b1 = (Button) findViewById(R.id.b1);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(finalActivity.this, Home.class);
                    startActivity(intent);

                }
            });


        Button b2= (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pgBar.setVisibility(View.VISIBLE);
                i = pgBar.getProgress();
                new Thread(new Runnable() {
                    public void run() {
                        while (i < 100) {
                            i += 1;
                            // Update the progress bar and display the current value in text view
                            hdlr.post(new Runnable() {
                                public void run() {
                                    pgBar.setProgress(i);

                                }
                            });
                            try {
                                // Sleep for 100 milliseconds to show the progress slowly.
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        Intent i=new Intent(finalActivity.this,ShowResult.class);
                        startActivity(i);

                    }
                }).start();

                editor.remove("key1");
                editor.remove("key2");
                editor.remove("key3");
                editor.commit();
                imageRes1=5;
                imageRes2=6;
                imageRes3=7;
                imageRes4=9;
                editor.clear();



            }
        });}}





















/*
        Bundle extras = getIntent().getExtras();

        if (extras.containsKey("eyebrow")) {
            desc = (extras.getString("IMAGE_URL"));
            img1 = (ImageView) findViewById(R.id.im1);
            img1.setImageResource(Integer.parseInt(desc));
        } else if (extras.containsKey("Lips")) {
            desc2 = extras.getString("IMAGE_URL");
            img2 = (ImageView) findViewById(R.id.im2);
            img2.setImageResource(Integer.parseInt(desc2));
        } else if (extras.containsKey("Lips")) {
            desc3 = extras.getString("IMAGE_URL");
            img3 = (ImageView) findViewById(R.id.im3);
            img3.setImageResource(Integer.parseInt(desc3));


        }
    }}
*/