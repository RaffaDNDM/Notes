package com.example.raffadndm;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class LiveActivity extends AppCompatActivity {

    public final static String KEY_LIVE = "KEY_LIVE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.live);
    }

    public void onPart(View view) {
        String part = (String) view.getContentDescription();

        Intent intent = new Intent(getApplicationContext(), PhotoLiveActivity.class);
        intent.putExtra(KEY_LIVE, part);
        startActivity(intent);
    }
}
