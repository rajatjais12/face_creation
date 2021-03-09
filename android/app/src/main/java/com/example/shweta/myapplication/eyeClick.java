package com.example.shweta.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import static android.R.attr.value;

public class eyeClick extends Activity {
    Object value;
    ImageView img1;
    Spinner spinner2;
    Spinner spinner;
int pos=5;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_click);
        spinner = (Spinner) findViewById(R.id.shape);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.shape, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner2 = (Spinner) findViewById(R.id.colour);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.colour, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner2.setAdapter(adapter2);

        img1 = (ImageView) findViewById(R.id.imageView);
        Button b1= (Button) findViewById(R.id.button);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                value = parent.getItemAtPosition(position);
                pos=position;
                switch (position) {
                    case 0:
                    case 1:
                        img1.setImageResource(R.drawable.left_eye_monolid);
                        break;
                    case 2:
                        img1.setImageResource(R.drawable.left_eye_almond);
                        break;
                    case 3:
                        img1.setImageResource(R.drawable.left_eye_round);
                        break;
                    case 4:
                        img1.setImageResource(R.drawable.left_eye_upturned);
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (pos != 5) {
            Intent intent = new Intent(eyeClick.this, finalActivity.class);
            intent.putExtra("eyebrow", "myeye");
            Log.d("hey", "Value: " +pos);
            intent.putExtra("id4", pos);
            startActivity(intent);
        finish();}


    }
});
     }

    }
