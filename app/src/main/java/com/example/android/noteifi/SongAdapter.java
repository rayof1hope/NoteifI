package com.example.android.noteifi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


/*
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each song and artist
 * based on a data source, which is a list of {@link Song} objects.
 * */
public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param songs A List of AndroidFlavor objects to display in a list
     */
    public SongAdapter(Context context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super( context, 0, songs );
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate(
                    R.layout.list_item, parent, false );
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Song currentSong = getItem( position );

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView SongTextView = (TextView) listItemView.findViewById( R.id.songs );
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        SongTextView.setText( currentSong.getSongsList() );

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artistTextView = (TextView) listItemView.findViewById( R.id.artists);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        artistTextView.setText( currentSong.getArtistsList() );

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
