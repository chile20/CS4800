/*
 * Assignment: 7 - Proxy
 * Author: Chi Le
 * File: SongService.java
 * Description: This class defines a SongService interface to implement Proxy design pattern
 */

package Proxy;

import java.util.List;

public interface SongService {
    Song searchById(Integer songID);
    List<Song> searchByTitle(String title);
    List<Song> searchByAlbum(String album);
}

