/*
 * Assignment: 7 - Proxy
 * Author: Chi Le
 * File: Main.java
 * Description: This class demonstrates the usage of services in handling song data with Proxy design pattern.
 */

package Proxy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song> songs = Arrays.asList(
                new Song("Song 1", "Artist A", "Album X", 210),
                new Song("Song 2", "Artist B", "Album Y", 190),
                new Song("Song 3", "Artist A", "Album X", 180),
                new Song("Song 4", "Artist C", "Album Z", 220),
                new Song("Song 5", "Artist D", "Album Y", 200),
                new Song("Song 6", "Artist B", "Album W", 120)
        );

        RealSongService realSongService = new RealSongService(songs);
        ProxySongService proxySongService = new ProxySongService(realSongService);

        System.out.println("Testing with Proxy Service:");
        testSearchByTitle(proxySongService);
        testSearchById(proxySongService);
        testSearchByAlbum(proxySongService);
    }

    private static void testSearchByTitle(SongService songService) {
        System.out.println("Testing searchByTitle:");
        long startTime = System.currentTimeMillis();
        System.out.println("Results: " + songService.searchByTitle("Song 1"));
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for first search: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        System.out.println("Results: " + songService.searchByTitle("Song 1"));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for second search (cached): " + (endTime - startTime) + " ms\n");
    }

    private static void testSearchById(SongService songService) {
        System.out.println("Testing searchById:");
        long startTime = System.currentTimeMillis();
        System.out.println("Results: " + songService.searchById(1));
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for first search: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        System.out.println("Results: " + songService.searchById(1));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for second search (cached): " + (endTime - startTime) + " ms\n");
    }

    private static void testSearchByAlbum(SongService songService) {
        System.out.println("Testing searchByAlbum:");
        long startTime = System.currentTimeMillis();
        System.out.println("Results: " + songService.searchByAlbum("Album X"));
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for first search: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        System.out.println("Results: " + songService.searchByAlbum("Album Y"));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for second search: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        System.out.println("Results: " + songService.searchByAlbum("Album X"));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for third search (cached): " + (endTime - startTime) + " ms\n");
    }
}


