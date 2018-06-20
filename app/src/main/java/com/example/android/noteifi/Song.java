package com.example.android.noteifi;

/**
 * {@link Song} represents a song list.
 * It contains artist details.
 */
public class Song {

    /** Songs String */
    private String mSongsList;
    private String mArtistsList;

    /**
     * Create a new Song object.
     *
     * @param songsList is the song list
     * @param artistsList is the artist singing the song
     */
    public Song(String songsList, String artistsList) {
        mSongsList = songsList;
        mArtistsList = artistsList;
    }

    /**
     * Get the song list.
     */
    public String getSongsList() {
        return mSongsList;
    }

    /**
     * Get the artist list.
     */
    public String getArtistsList() {
        return mArtistsList;
    }

}
