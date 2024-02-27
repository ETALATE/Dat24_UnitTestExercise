import java.util.Objects;

public class Track {
    private String title;
    private String artist;

    public Track(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return Objects.equals(title, track.title) &&
                Objects.equals(artist, track.artist);
    }
}

