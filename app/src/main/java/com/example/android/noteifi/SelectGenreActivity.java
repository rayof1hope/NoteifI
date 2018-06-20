package com.example.android.noteifi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class SelectGenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_select_genre );

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

        // Create a list of genre
        ArrayList<String> genre = new ArrayList<String>();
        genre.add( "Country" );
        genre.add( "Folk" );
        genre.add( "Gospel" );
        genre.add( "Christian Rock" );
        genre.add( "Disco" );
        genre.add( "Classic Rock" );
        genre.add( "Alternative Rock" );
        genre.add( "Rock" );
        genre.add( "Heavy Metal" );
        genre.add( "Punk" );
        genre.add( "New Wave" );
        genre.add( "Pop" );
        genre.add( "Techno" );
        genre.add( "Jazz" );
        genre.add( "Soul" );
        genre.add( "Rhythm and Blues" );
        genre.add( "Hip Hop" );
        genre.add( "Rap" );
        genre.add( "Reggae" );
        genre.add( "Classical" );
        genre.add( "Opera" );

        // Create an {@link ArrayAdapter}, whose data source is a list of strings. The
        // adapter knows how to create layouts for each item in the list, using
        // simple_list_item_1.xml layout source defined in the android framework.
        // This list item layout contains a single {@link textView}, which the adapter will set to
        // display a single word.


        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, genre );


        //Find the {@link ListView} object in the view hierarchy of thr {@link Activity}.
        // There should be a {@link ListView} with the View ID called list, which is declared
        // in the activity_select_genre.xml layout file.
        ListView listView = (ListView) findViewById( R.id.list );

        // Make the {@link ListView} use the {@link ArrayAdapter} created above, so the
        // {@link ListView} will display list items for each genre in the list of genres.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter( itemsAdapter );


        // Find the View that shows the music genres
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Create a new intent to open the {@link SelectGenreActivity}
                Intent categoryIntent = new Intent( SelectGenreActivity.this, SongListActivity.class );

                // Start the new activity
                startActivity( categoryIntent );
            }
        } );


    }
}

