public class Song {
    // Private variables storing information off the song
    private String artist;
    private String title;
    private int playCount;

    // constructor to initalize the song with the given variables
    public Song(String artist, String title, int playCount) {
        this.artist = artist;
        this.title = title;
        this.playCount = playCount;
    }

    // getter methods to retrieve information of the song as the variables are
    // private
    public String getartist() {
        return artist;
    }

    public String gettitle() {
        return title;
    }

    public int getplayCount() {
        return playCount;
    }

    // setter metods to update and change the information of the song
    public void setartist(String artist) {
        this.artist = artist;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public void setplayCOunt(int playCount) {
        this.playCount = playCount;
    }
}
