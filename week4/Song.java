public class Song {
    private String title;
    private String artist;
    private int year;

    Song(String title, String artist, int year){
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public String getTitle(){
        return this.title;
    }
    public String getArtist(){
        return this.artist;
    }
    public int getYear(){
        return this.year;
    }
    public int setYear(int year){
        return this.year = year;
    }
    public String setTitle(String title){
        return this.title = title;
    }
    public String setArtist(String artist){
        return this.artist = artist;
    }
    public String toString() {
        return "Song: " + title + " by " + artist + " (" + year + ")";
    }

    
}
