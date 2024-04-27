/*
 * Assignment: 7 - Proxy
 * Author: Chi Le
 * File: Song.java
 * Description: This class represents a Song object, encapsulating attributes such as title, artist, album, and duration.
 */

package Proxy;

public class Song {
    private String title;
    private String artist;
    private String album;
    private int duration;

    /**
     * Constructs a Song with specified title, artist, album, and duration.
     *
     * @param title the title of the song
     * @param artist the artist who performs the song
     * @param album the album on which the song appears
     * @param duration the duration of the song in seconds
     */

    public Song(String title, String artist, String album, int duration) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    /**
     * @return the title of the song
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the artist of the song
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @return the album of the song
     */
    public String getAlbum() {
        return album;
    }

    /**
     * @return the duration of the song
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Provides a string representation of the song, formatted for readability.
     *
     * @return formatted string with song details
     */
    @Override
    public String toString() {
        return String.format("Song{title='%s', artist='%s', album='%s', duration=%d}", title, artist, album, duration);
    }
}

