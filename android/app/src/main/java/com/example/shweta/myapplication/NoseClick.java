package com.example.shweta.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class NoseClick extends Activity {
    private GridView gridview1;
    private ArrayList<HashMap<String, Object>> maplist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nose_click);
        gridview1 = (GridView) findViewById(R.id.mainGridView1);

        gridview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Pass image index
                String imageUrl = (String) parent.getItemAtPosition(position);
                // img.setImageResource((int) gridview1.getItemIdAtPosition(position));
                Intent intent = new Intent(NoseClick.this, finalActivity.class);
                intent.putExtra("eyebrow","mynose");
                intent.putExtra("IMAGE_URL", imageUrl);
                intent.putExtra("id3",position);
                startActivity(intent);
                finish();


            }
        });
        // Add items to the Map list
        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "Nose_wide ");
            _item.put("icon", R.drawable.nose_wide);
            maplist.add(_item);
        }
        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "Nose_crooked");
            _item.put("icon",  R.drawable.crooked);
            maplist.add(_item);
        }
        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "Nose_long");
            _item.put("icon",  R.drawable.nose_long);
            maplist.add(_item);
        }
        {
            HashMap<String, Object> _item = new HashMap<>();
            _item.put("title", "Nose_short");
            _item.put("icon",  R.drawable.nose_short);
            maplist.add(_item);
        }


        GridAdapter adapter = new GridAdapter(this);
        gridview1.setAdapter(adapter);

    }

    public class GridAdapter extends BaseAdapter {
        private Context mContext;
        public GridAdapter(Context c) {
            mContext = c;
        }
        public int getCount() {
            return maplist.size();
        }
        public Object getItem(int position) {
            return null;
        }
        public long getItemId(int position) {
            return 0;
        }
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = convertView;
            // Inflate the layout for each list item
            LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (v == null) {
                v = _inflater.inflate(R.layout.part4, null);
            }
            // Get the TextView and ImageView from CustomView for displaying item
            TextView txtview = (TextView) v.findViewById(R.id.listitemTextView1);
            ImageView imgview = (ImageView) v.findViewById(R.id.listitemImageView1);

            // Set the text and image for current item using data from map list
            txtview.setText(maplist.get(position).get("title").toString());
            imgview.setImageResource((Integer) maplist.get(position).get("icon"));
            return v;
        }
    }

}










