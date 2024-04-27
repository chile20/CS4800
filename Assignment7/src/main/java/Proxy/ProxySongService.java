/*
 * Assignment: 7 - Proxy
 * Author: Chi Le
 * File: ProxySongService.java
 * Description: This class acts as a proxy to the RealSongService, providing an additional caching layer to improve performance.
 */

package Proxy;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ProxySongService implements SongService {
    private RealSongService realSongService;
    private Map<Integer, Song> idCache = new HashMap<>();
    private Map<String, List<Song>> titleCache = new HashMap<>();
    private Map<String, List<Song>> albumCache = new HashMap<>();

    /**
     * Constructs a ProxySongService with a specific RealSongService.
     *
     * @param realSongService the real service that provides the actual song data
     */
    public ProxySongService(RealSongService realSongService) {
        this.realSongService = realSongService;
    }

    /**
     * Searches for a song by its ID using a caching mechanism to optimize performance.
     * If the song is not in the cache, it retrieves it from the real service and caches it.
     *
     * @param songID the ID of the song to search for
     * @return the song if found, otherwise null
     */
    @Override
    public Song searchById(Integer songID) {
        if (!idCache.containsKey(songID)) {
            idCache.put(songID, realSongService.searchById(songID));
        }
        return idCache.get(songID);
    }

    /**
     * Searches for songs by title using a caching mechanism to optimize performance.
     * If the songs are not in the cache, it retrieves them from the real service and caches the result.
     *
     * @param title the title of the songs to search for
     * @return a list of songs that match the title
     */
    @Override
    public List<Song> searchByTitle(String title) {
        if (!titleCache.containsKey(title.toLowerCase())) {
            titleCache.put(title.toLowerCase(), realSongService.searchByTitle(title));
        }
        return titleCache.get(title.toLowerCase());
    }

    /**
     * Searches for songs by album using a caching mechanism to optimize performance.
     * If the songs are not in the cache, it retrieves them from the real service and caches the result.
     *
     * @param album the album name to search for songs within
     * @return a list of songs that are in the specified album
     */
    @Override
    public List<Song> searchByAlbum(String album) {
        if (!albumCache.containsKey(album.toLowerCase())) {
            albumCache.put(album.toLowerCase(), realSongService.searchByAlbum(album));
        }
        return albumCache.get(album.toLowerCase());
    }
}
