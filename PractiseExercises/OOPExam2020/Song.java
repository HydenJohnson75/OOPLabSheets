package PractiseExercises.OOPExam2020;

public class Song {
    private static int trackID;
    private int trackNumber;
    private String title;
    private String artist;
    private String genre;
    private int duration;
    private int releaseYear;

    public Song() {
        this("Not Specified", "Not Specified", "Not Specified",0,0);
    }

    public Song(String title, String artist, String genre, int duration, int releaseYear) {
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setDuration(duration);
        setReleaseYear(releaseYear);
    }

    public static int getTrackID() {
        return trackID;
    }

    public static void setTrackID(int trackID) {
        Song.trackID = trackID;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    private void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "\nTrack ID:" + getTrackID() + "\nTrack Number: " + getTrackNumber() + "\nTitle: " + getTitle()+
                "\nArtist: " + getArtist() + "\nGenre: " + getGenre() + "\nDuration: " + getDuration() +
                "\nRelease Year: " + getReleaseYear();

    }
}
