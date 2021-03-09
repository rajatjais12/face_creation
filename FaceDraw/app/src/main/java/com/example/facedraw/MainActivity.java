package com.example.facedraw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

//    LinearLayout row [] = new LinearLayout[5];
//    FrameLayout fl = findViewById(R.id.fl);
    //    ImageButton[] feat = new ImageButton[4];
    ImageButton[] face = new ImageButton[7];
    ImageButton[] eye = new ImageButton[7];
    ImageButton[] noses = new ImageButton[7];
    ImageButton[] lips = new ImageButton[7];

    ImageView eye_img, nose_img, lip_img, face_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        row[0] = findViewById(R.id.feature);
//        row[1] = findViewById(R.id.faces);
//        row[2] = findViewById(R.id.eyes);
//        row[3] = findViewById(R.id.nose);
//        row[4] = findViewById(R.id.lips);


        eye_img = findViewById(R.id.eye_img);
        nose_img = findViewById(R.id.nose_img);
        lip_img = findViewById(R.id.lip_img);
        face_img = findViewById(R.id.face_img);

        face[0] = findViewById(R.id.face1);
        face[1] = findViewById(R.id.face2);
        face[2] = findViewById(R.id.face3);
        face[3] = findViewById(R.id.face4);
        face[4] = findViewById(R.id.face5);
        face[5] = findViewById(R.id.face6);
        face[6] = findViewById(R.id.face7);
        eye[0] = findViewById(R.id.i1);
        eye[1] = findViewById(R.id.i2);
        eye[2] = findViewById(R.id.i3);
        eye[3] = findViewById(R.id.i4);
        eye[4] = findViewById(R.id.i5);
        eye[5] = findViewById(R.id.i6);
        eye[6] = findViewById(R.id.i7);
        noses[0] = findViewById(R.id.ns1);
        noses[1] = findViewById(R.id.ns2);
        noses[2] = findViewById(R.id.ns3);
        noses[3] = findViewById(R.id.ns4);
        noses[4] = findViewById(R.id.ns5);
        noses[5] = findViewById(R.id.ns6);
        noses[6] = findViewById(R.id.ns7);
        lips[0] = findViewById(R.id.lip1);
        lips[1] = findViewById(R.id.lip2);
        lips[2] = findViewById(R.id.lip3);
        lips[3] = findViewById(R.id.lip4);
        lips[4] = findViewById(R.id.lip5);
        lips[5] = findViewById(R.id.lip6);
        lips[6] = findViewById(R.id.lip7);


        face[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                face_img.setImageResource(R.drawable.face1);
            }
        });
        face[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                face_img.setImageResource(R.drawable.face2);
            }
        });
        face[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                face_img.setImageResource(R.drawable.face3);
            }
        });
        face[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                face_img.setImageResource(R.drawable.face4);
            }
        });
        face[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                face_img.setImageResource(R.drawable.face5);
            }
        });
        face[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                face_img.setImageResource(R.drawable.face6);
            }
        });
        face[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                face_img.setImageResource(R.drawable.face7);
            }
        });


        eye[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eye_img.setImageResource(R.drawable.eyes1);
            }
        });
        eye[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eye_img.setImageResource(R.drawable.eyes2);
            }
        });
        eye[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eye_img.setImageResource(R.drawable.eyes3);
            }
        });
        eye[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eye_img.setImageResource(R.drawable.eyes4);
            }
        });
        eye[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eye_img.setImageResource(R.drawable.eyes5);
            }
        });
        eye[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eye_img.setImageResource(R.drawable.eyes6);
            }
        });
        eye[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eye_img.setImageResource(R.drawable.eyes7);
            }
        });



        noses[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nose_img.setImageResource(R.drawable.nose1);
            }
        });
        noses[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nose_img.setImageResource(R.drawable.nose2);
            }
        });
        noses[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nose_img.setImageResource(R.drawable.nose3);
            }
        });
        noses[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nose_img.setImageResource(R.drawable.nose4);
            }
        });
        noses[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nose_img.setImageResource(R.drawable.nose5);
            }
        });
        noses[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nose_img.setImageResource(R.drawable.nose6);
            }
        });
        noses[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nose_img.setImageResource(R.drawable.nose7);
            }
        });



        lips[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lip_img.setImageResource(R.drawable.lip1);
            }
        });
        lips[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lip_img.setImageResource(R.drawable.lip2);
            }
        });
        lips[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lip_img.setImageResource(R.drawable.lip3);
            }
        });
        lips[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lip_img.setImageResource(R.drawable.lip4);
            }
        });
        lips[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lip_img.setImageResource(R.drawable.lip5);
            }
        });
        lips[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lip_img.setImageResource(R.drawable.lip6);
            }
        });
        lips[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lip_img.setImageResource(R.drawable.lip7);
            }
        });


    }
}