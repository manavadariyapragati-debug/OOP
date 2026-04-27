import java.util.*;

public class Pr31 {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        System.out.println("Playlist: " + playlist);

        System.out.println("Playing: " + playlist.removeFirst());
        System.out.println("Playlist after playing first song: " + playlist);

        System.out.println("Skipping: " + playlist.removeLast());
        System.out.println("Playlist after skipping last song: " + playlist);
    }
}

/*
Output:
Playlist: [Song A, Song B, Song C, Song D]
Playing: Song A
Playlist after playing first song: [Song B, Song C, Song D]
Skipping: Song D
Playlist after skipping last song: [Song B, Song C]
*/
