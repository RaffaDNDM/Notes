package com.example.raffadndm;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PhotoActivity extends AppCompatActivity {

    public final static String KEY = "KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.gallery);
    }

    public void photoSection(View view)
    {
        String type_photo = (String) view.getContentDescription();

        Intent intent = new Intent(this, GalleryActivity.class);
        intent.putExtra(KEY, type_photo);
        startActivity(intent);
    }
}
