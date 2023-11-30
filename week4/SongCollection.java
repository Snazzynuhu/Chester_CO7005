import java.util.Arrays;

public class SongCollection {
    public static void main(String[] args) {
        Song song1 = new Song("Sleeping child", "MLTR", 2001);
        Song song2 = new Song("Could you be loved", "Bob Marley", 2002);
        Song song3 = new Song("River of Babylon", "Boney-M", 1979);
        Song song4 = new Song("Mirrors", "Bruno mars", 2018);
        Song song5 = new Song("Outside", "Buju", 2022);

        Song[] songList = {song1, song2, song3, song4, song5};
        System.out.println("List of songs: "+ Arrays.toString(songList));

    }
    
}
