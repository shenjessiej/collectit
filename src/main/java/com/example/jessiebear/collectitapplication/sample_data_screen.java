package com.example.jessiebear.collectitapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sample_data_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_data_screen);
    }

    public void addData(View view) {
        Intent intent = new Intent(this, add_data.class);
        startActivity(intent);
    }

    public void viewData(View view) {
        Intent intent = new Intent(this, saveddata.class);
        startActivity(intent);
    }

    public void viewMap(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
