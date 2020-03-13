package com.example.raffadndm;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.info);
    }

    public void photo(View view) {
        Intent intent = new Intent(getApplicationContext(), PhotoActivity.class);
        startActivity(intent);
    }

    public void music(View view) {
        Intent intent = new Intent(getApplicationContext(), MusicActivity.class);
        startActivity(intent);
    }

    public void github(View view) {
        Intent intent = new Intent(getApplicationContext(), GithubActivity.class);
        startActivity(intent);
    }
}
