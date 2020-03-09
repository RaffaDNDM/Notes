package com.example.photodndm;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class GithubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.info);
    }

    public void gitSearch(View view) {
        String url = (String) view.getContentDescription();

        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if(intent.resolveActivity(getPackageManager()) != null)
            startActivity(intent);
        else
            Log.d("ImplicitIntents", "Can't load it");
    }
}
