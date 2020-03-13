package com.example.raffadndm;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PostersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posters);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.posters);
    }

    public void onPhoto(View view) {
        String date = (String) view.getContentDescription();
        Context context = getApplicationContext();

        Toast toast = Toast.makeText(context, date, Toast.LENGTH_SHORT);
        toast.show();
    }
}
