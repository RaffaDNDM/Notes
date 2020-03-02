package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void photo(View view)
    {
        setContentView(R.layout.photo);
    }

    public void tutorial(View view)
    {
        setContentView(R.layout.tutorial);
    }
}

