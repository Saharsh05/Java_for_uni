public class Song {
    private String artist; 
    private String title; 
    private int playCount; 

    public Song(String artist, String title, int playCount)
    {
        this.artist = artist; 
        this.title = title; 
        this.playCount = playCount; 
    }

    public String getartist()
    {
        return artist; 
    }
    
    public String gettitle()
    {
        return title; 
    }

    public int getplayCount()
    {
        return playCount; 
    }

    public void setartist(String artist)
    {
        this.artist = artist; 
    }

    public void settitle(String title)
    {
        this.title = title; 
    }

    public void setplayCOunt(int playCount)
    {
        this.playCount = playCount; 
    }
}
