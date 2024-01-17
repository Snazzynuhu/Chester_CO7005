package Media;


public class MyMedia {
    public static void main(String[] args) {

        MediaLibrary mediaLibrary = new MediaLibrary();

        Song song1 = new Song("Every Breath", "The Police", 2000);
        Song song2 = new Song("Shape of my heart", "BackStreet Boys", 2001);
        Song song3 = new Song("I don't", "West-Life", 2002);
        Song song4 = new Song("Sacrifice", "Michael Bolton", 1995);

        // System.out.println("Song one here"+ song1);

        // Add songs to the MediaLibrary
        mediaLibrary.addSong(song1);    
        mediaLibrary.addSong(song2);
        mediaLibrary.addSong(song3);
        mediaLibrary.addSong(song4);

        // System.out.println("Media Songs Collection"+  mediaLibrary);

        mediaLibrary.displayAllSongs();
    }
}

