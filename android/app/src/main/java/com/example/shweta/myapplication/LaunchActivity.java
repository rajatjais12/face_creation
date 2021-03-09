package com.example.shweta.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class LaunchActivity extends Activity {
Activity ctx=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        ImageView iv1 = (ImageView) findViewById(R.id.flaImageView);
        Animation a1 = AnimationUtils.loadAnimation(ctx, R.anim.anim1);
        iv1.startAnimation(a1);
        Timer t1 = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                String token = MyUtils.getPref(ctx, "token");
                if("".equalsIgnoreCase(token)){
                    Intent i1 = new Intent(ctx, Home.class);
                    startActivity(i1);
                }
                else {
                    Intent i1 = new Intent(ctx,Home.class);
                    startActivity(i1);
                }
                ctx.finish();
            }
        };
        t1.schedule(tt, 2000);
    }
}
