
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class mp4 {

    // Declaring Arraylist for object Song
    private ArrayList<Song> songs = new ArrayList<Song>();

    // Constructor to initalize mp4 player with predefined song information
    public mp4() {

        songs.add(new Song("Travis Scott", "MELTDOWN", 203003625));
        songs.add(new Song("Metro Boomin", "Superhero", 503447652));
        songs.add(new Song("21 Savage", "Glock In My Lap", 441347306));
        songs.add(new Song("J. Cole", "Wet Dreamz", 1094891476));
        songs.add(new Song("JACKBOYS", "WHAT TO DO?", 178625453));
        songs.add(new Song("Baby Keem", "trademark usa", 165322978));
        songs.add(new Song("The Weeknd", "Popular", 349939728));
        songs.add(new Song("Burna Boy", "Last Last", 342544284));
        songs.add(new Song("Giveon", "Heart Break Anniversary", 1019011303));
        songs.add(new Song("Juice WRLD", "Let Me Know", 426607410));

    }

    // Method to add new song to the mp4 player/ Arraylist
    public void addSong() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the name of the artist you want to add?");

        String artist = scanner.nextLine();

        System.out.println("What is the name of the song?");

        String title = scanner.nextLine();

        System.out.println("How many plays does this song have?");

        int playCount = scanner.nextInt();

        Song newSongs = new Song(artist, title, playCount);

        songs.add(newSongs);

    }

    // Method to remove songs from mp4 player/ Arraylist
    public void removeSong() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the name of the artist you want to remove?");
        String removeArtist = scanner.nextLine();

        System.out.println("What is the title of the song you want to remove?");
        String removeTitle = scanner.nextLine();

        Iterator<Song> iterator = songs.iterator();

        while (iterator.hasNext()) {
            Song currentSong = iterator.next();

            if (currentSong.getartist().equals(removeArtist) || currentSong.gettitle().equals(removeTitle)) {
                iterator.remove();

            }
        }

        System.out.println("Song was removed successfully");

    }

    // Method to print all the song details off the mp4 player into the terminal
    public void printSong() {
        for (Song printSong : songs) {
            System.out.println(" artist: " + printSong.getartist() + " title: " + printSong.gettitle() + " streams: "
                    + printSong.getplayCount());
        }
    }

    // Method to filter through Arraylist to print songs based on a minimum number
    // of streams
    public void givenPlays(Scanner scanner) {
        System.out.println("Enter in the minimum number of streams");
        int streams = scanner.nextInt();
        scanner.nextLine();

        System.out.println("These are all the songs that have a greater number of streams than " + streams + ":");

        for (Song givenPlays : songs) {
            if (givenPlays.getplayCount() > streams) {
                System.out.println("Artist: " + givenPlays.getartist() + " Title: " + givenPlays.gettitle()
                        + " Streams: " + givenPlays.getplayCount());
            }
        }
    }

}