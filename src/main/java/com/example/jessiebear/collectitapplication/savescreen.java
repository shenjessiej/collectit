package com.example.jessiebear.collectitapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class savescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savescreen);
    }

    public void addMore(View view) {
        Intent intent = new Intent(this, add_data.class);
        startActivity(intent);
    }

    public void viewSaved(View view) {
        Intent intent = new Intent(this, saveddata.class);
        startActivity(intent);
    }
}
