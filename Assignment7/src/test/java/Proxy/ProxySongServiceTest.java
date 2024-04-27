package Proxy;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class ProxySongServiceTest {
    private RealSongService realSongService;
    private ProxySongService proxySongService;

    @Before
    public void setUp() {
        List<Song> songs = Arrays.asList(
                new Song("Song 1", "Artist A", "Album X", 210),
                new Song("Song 2", "Artist B", "Album Y", 190),
                new Song("Song 3", "Artist A", "Album X", 180),
                new Song("Song 4", "Artist C", "Album Z", 220),
                new Song("Song 5", "Artist D", "Album Y", 200)
        );
        realSongService = new RealSongService(songs);
        proxySongService = new ProxySongService(realSongService);
    }

    @Test
    public void testCachingById() {
        Integer songId = 1;
        // Simulate delay in real service and verify caching effectiveness
        Song song = proxySongService.searchById(songId);  // Assuming this might simulate the delay
        long startTime = System.currentTimeMillis();
        Song cachedSong = proxySongService.searchById(songId);
        long elapsedTime = System.currentTimeMillis() - startTime;

        assertSame("Returned objects should be the same when cached", song, cachedSong);
        assertTrue("Elapsed time should be minimal due to caching", elapsedTime < 10);
    }

    @Test
    public void testCachingByTitle() {
        String title = "Song 1";
        // Simulate delay in real service and verify caching effectiveness
        List<Song> result = proxySongService.searchByTitle(title);  // First call
        long startTime = System.currentTimeMillis();
        List<Song> cachedResult = proxySongService.searchByTitle(title);  // Second call
        long elapsedTime = System.currentTimeMillis() - startTime;

        assertSame("Returned lists should be the same when cached", result, cachedResult);
        assertTrue("Elapsed time should be minimal due to caching", elapsedTime < 10);
    }

    @Test
    public void testCachingByAlbum() {
        String album = "Album X";
        // Simulate delay in real service and verify caching effectiveness
        List<Song> result = proxySongService.searchByAlbum(album);  // First call
        long startTime = System.currentTimeMillis();
        List<Song> cachedResult = proxySongService.searchByAlbum(album);  // Second call
        long elapsedTime = System.currentTimeMillis() - startTime;

        assertSame("Returned lists should be the same when cached", result, cachedResult);
        assertTrue("Elapsed time should be minimal due to caching", elapsedTime < 10);
    }
}


