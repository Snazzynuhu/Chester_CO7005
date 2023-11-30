package Media;

import java.util.ArrayList;
import java.util.List;

public class MediaLibrary {
    private List<Song> songs;

    public MediaLibrary() {
        this.songs = new ArrayList<>();
    }

    // Method to add a song to the library
    public void addSong(Song song) {
        songs.add(song);
    }

    // Method to display details of all songs in the library
    public void displayAllSongs() {
        for (Song song : songs) {
            song.toString();
            System.out.println(song);
        }
    }
}

