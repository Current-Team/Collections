public class Song implements Comparable<Song> {
    public int releaseYear;
    public String name;

    public Song(int releaseYear, String name) {
        this.releaseYear = releaseYear;
        this.name = name;
    }

    @Override
    public int compareTo(Song o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Song{" +
                "releaseYear=" + releaseYear +
                ", name='" + name +
                '}';
    }
}
