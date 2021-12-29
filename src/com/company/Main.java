import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song(1988, "Smooth Criminal");
        Song song2 = new Song(1981, "In The Air Tonight");
        Song song3 = new Song(1967, "Nights in White Satin");
        MyArrayList<Song> songs = new MyArrayList<Song>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3, 1);
        System.out.println(Arrays.toString(songs.getObjects()));
    }

}
