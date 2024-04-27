package Proxy;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class RealSongServiceTest {
    private RealSongService realSongService;
    private List<Song> songs;

    @Before
    public void setUp() {
        songs = Arrays.asList(
                new Song("Song 1", "Artist A", "Album X", 210),
                new Song("Song 2", "Artist B", "Album Y", 190),
                new Song("Song 3", "Artist A", "Album X", 180),
                new Song("Song 4", "Artist C", "Album Z", 220),
                new Song("Song 5", "Artist D", "Album Y", 200)
        );
        realSongService = new RealSongService(songs);
    }

    @Test
    public void testSearchById() {
        assertEquals("Expected Song 1", songs.get(0), realSongService.searchById(0));
        assertNull("Expected null for out of bounds index", realSongService.searchById(5));
    }

    @Test
    public void testSearchByTitle() {
        List<Song> result = realSongService.searchByTitle("Song 1");
        assertNotNull("Result should not be null", result);
        assertEquals("Expected 1 song", 1, result.size());
        assertEquals("Expected Song 1", songs.get(0), result.get(0));
    }

    @Test
    public void testSearchByAlbum() {
        List<Song> result = realSongService.searchByAlbum("Album X");
        assertNotNull("Result should not be null", result);
        assertEquals("Expected 2 songs", 2, result.size());
        assertTrue("Expected Song 1 in results", result.contains(songs.get(0)));
        assertTrue("Expected Song 3 in results", result.contains(songs.get(2)));
    }
}
