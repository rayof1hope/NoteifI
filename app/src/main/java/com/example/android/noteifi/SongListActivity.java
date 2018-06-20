package com.example.android.noteifi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SongListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_song_list );

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add( new Song( "Shoreline", "Breakers" ) );
        songs.add( new Song( "Believe In Me", "Friends" ) );
        songs.add( new Song( "Sowing Seeds", "Apple" ) );
        songs.add( new Song( "Who's Got The Dough", "Bread" ) );
        songs.add( new Song( "Smelly Cat", "Cat Lovers" ) );
        songs.add( new Song( "Where's The Food", "Dog Lovers" ) );
        songs.add( new Song( "No Meat For Me", "Eggplants" ) );
        songs.add( new Song( "Flying", "Freebird" ) );
        songs.add( new Song( "We Aren't Old", "Golden Girls" ) );
        songs.add( new Song( "Smiling", "Happy People" ) );

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter( this, songs );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById( R.id.songs );

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter( adapter );

        // Find the View that shows the songs
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Create a new intent to open the {@link SelectGenreActivity}
                Intent currentSongIntent = new Intent( SongListActivity.this, CurrentlyPlayingActivity.class );

                // Start the new activity
                startActivity( currentSongIntent );
            }
        } );
    }
}
