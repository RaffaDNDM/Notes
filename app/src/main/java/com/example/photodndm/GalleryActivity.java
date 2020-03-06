package com.example.photodndm;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        final String type_photo = intent.getStringExtra(PhotoActivity.KEY);

        int resourceId = this.getResources().getIdentifier(type_photo+"_gallery", "layout", this.getPackageName());
        setContentView(resourceId);
        ActionBar actionBar = getSupportActionBar();

        if(resourceId != R.layout.sanmartino_gallery)
            actionBar.setTitle(type_photo.substring(0,1).toUpperCase()+type_photo.substring(1));
        else
            actionBar.setTitle(getString(R.string.sanmartino_title));
    }

    public void onPhoto(View view) {
        String date = (String) view.getContentDescription();
        Context context = getApplicationContext();

        Toast toast = Toast.makeText(context, date, Toast.LENGTH_SHORT);
        toast.show();
    }
}
