package com.example.photodndm;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.menu);
    }

    public void photo(View view)
    {
        Intent intent = new Intent(this, PhotoActivity.class);
        startActivity(intent);
    }

    public void github(View view)
    {
        Intent intent = new Intent(this, GithubActivity.class);
        startActivity(intent);
    }

    public void music(View view) {
        Intent intent = new Intent(this, MusicActivity.class);
        startActivity(intent);
    }

    public void fun(View view) {

    }

    public void about(View view) {

    }
}

