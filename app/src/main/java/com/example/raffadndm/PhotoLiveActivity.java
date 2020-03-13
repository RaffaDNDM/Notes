package com.example.raffadndm;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.raffadndm.LiveActivity;

public class PhotoLiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String part = intent.getStringExtra(LiveActivity.KEY_LIVE);
        int resource = this.getResources().getIdentifier(part+"_live", "layout", getPackageName());

        setContentView(resource);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.live);
    }

    public void photoInfo(View view) {
        String date = (String) view.getContentDescription();
        Context context = getApplicationContext();

        Toast toast = Toast.makeText(context, date, Toast.LENGTH_SHORT);
        toast.show();
    }
}

