package com.example.shweta.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import static android.os.Build.VERSION_CODES.M;

public class EyeBrowClick extends Activity {
    GridView gridView;

    String[] fruitNames = {"Apple","Orange","strawberry","Melon"};
    int[] fruitImages = {R.drawable.right_eyebrow_angled,R.drawable.right_eyebrow_round,R.drawable.right_eyebrow_s,R.drawable.right_eyebrow_str};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_brow_click);

        //finding listview
        gridView = (GridView) findViewById(R.id.mainGridView1);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),finalActivity.class);
                intent.putExtra("eyebrow","meyebrow");
                intent.putExtra("Image", ""+fruitImages[position]);
                intent.putExtra("id1",position);

                Log.d("tag1", "Value: " +fruitImages[position]);
                Log.d("tag2", "Value: " +position);

                startActivity(intent);
                finish();
            }
        });




    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return fruitImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.part4,null);
            //getting view in row_data
            TextView name = (TextView) view1.findViewById(R.id.listitemTextView1);
            ImageView image = (ImageView) view1.findViewById(R.id.listitemImageView1);

            name.setText(fruitNames[i]);
            image.setImageResource(fruitImages[i]);
            return view1;



        }
    }

    public static Drawable LoadImageFromWebOperations(String url) {
        try {
            InputStream is = (InputStream) new URL(url).getContent();
            Drawable d = Drawable.createFromStream(is, "src name");
            return d;
        } catch (Exception e) {
            return null;
        }
    }

}

