package com.example.raffadndm;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_band);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.band);
    }

    public void music(View view) {
        Intent intent = new Intent(this, MusicActivity.class);
        startActivity(intent);
    }

    public void live(View view) {
        Intent intent = new Intent(this, LiveActivity.class);
        startActivity(intent);
    }

    public void posters(View view) {
        Intent intent = new Intent(this, PostersActivity.class);
        startActivity(intent);
    }
}
