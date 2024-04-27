package Proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SongTest {
    private Song song;

    @BeforeEach
    void setUp() {
        song = new Song("Yesterday", "The Beatles", "Help!", 123);
    }

    @Test
    void testConstructorAndGetterTitle() {
        assertEquals("Yesterday", song.getTitle(), "The title should match the constructor input.");
    }

    @Test
    void testGetterArtist() {
        assertEquals("The Beatles", song.getArtist(), "The artist should match the constructor input.");
    }

    @Test
    void testGetterAlbum() {
        assertEquals("Help!", song.getAlbum(), "The album should match the constructor input.");
    }

    @Test
    void testGetterDuration() {
        assertEquals(123, song.getDuration(), "The duration should match the constructor input.");
    }

    @Test
    void testToString() {
        String expected = "Song{title='Yesterday', artist='The Beatles', album='Help!', duration=123}";
        assertEquals(expected, song.toString(), "The toString output should match the expected format.");
    }
}
