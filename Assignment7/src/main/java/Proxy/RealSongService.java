/*
 * Assignment: 7 - Proxy
 * Author: Chi Le
 * File: RealSongService.java
 * Description: This class implements the SongService interface and represents the actual service that handles song data retrieval.
 */

package Proxy;

import java.util.ArrayList;
import java.util.List;

public class RealSongService implements SongService {
    private List<Song> songs;

    /**
     * Constructs a RealSongService with a predefined list of songs.
     *
     * @param songs the list of songs this service will manage
     */
    public RealSongService(List<Song> songs) {
        this.songs = songs;
    }

    /**
     * Searches for a song by its ID, simulating network latency before returning the result.
     * If the songID is out of bounds, it returns null.
     *
     * @param songID the ID of the song to search for
     * @return the song if found, otherwise null
     */
    @Override
    public Song searchById(Integer songID) {
        simulateNetworkDelay();
        if (songID < 0 || songID >= songs.size()) {
            return null;
        }
        return songs.get(songID);    }

    /**
     * Searches for songs matching a given title, simulating network latency before returning the results.
     *
     * @param title the title of the songs to search for
     * @return a list of songs that match the title
     */
    @Override
    public List<Song> searchByTitle(String title) {
        simulateNetworkDelay();
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                result.add(song);
            }
        }
        return result;
    }

    /**
     * Searches for songs contained in a specific album, simulating network latency before returning the results.
     *
     * @param album the album name to search for songs within
     * @return a list of songs that are in the specified album
     */
    @Override
    public List<Song> searchByAlbum(String album) {
        simulateNetworkDelay();
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                result.add(song);
            }
        }
        return result;
    }

    /**
     * Simulates network latency by pausing the thread for a specified duration.
     */
    private void simulateNetworkDelay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

