package com.example.android.noteifi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CurrentlyPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_currently_playing );

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );


    }
}


