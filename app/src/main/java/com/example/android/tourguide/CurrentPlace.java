package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by euenia on 2018-08-01.
 */

public class CurrentPlace extends AppCompatActivity {
    TextView finalName;
    TextView finalLocalization;
    ImageView finalImage;
    TextView finalDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_place);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Gets intent and ListView item data from activities with lists
        Intent intent = getIntent();
        if (intent != null) {
            finalName = (TextView) findViewById(R.id.current_name);
            finalLocalization = (TextView) findViewById(R.id.current_localization);
            finalImage = (ImageView) findViewById(R.id.current_image);
            finalDescription = (TextView) findViewById(R.id.current_description);
            finalName.setText(intent.getStringExtra("R.string.name_key"));
            finalLocalization.setText(intent.getStringExtra("R.string.localization_key"));
            finalImage.setImageResource(intent.getIntExtra("R.string.image_key", 0));
            finalDescription.setText(intent.getStringExtra("R.string.description_key"));
            finalDescription.setGravity(Gravity.LEFT);
        }
    }
}
