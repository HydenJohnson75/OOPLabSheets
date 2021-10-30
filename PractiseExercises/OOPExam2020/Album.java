package PractiseExercises.OOPExam2020;

import java.util.Arrays;

public class Album {

    private String name;
    private Song tracks[];
    private String producer;
    private int releaseYear;

    public Album() {
        setName(getName());
        setTracks(null);
        setProducer("Not specified");
        setReleaseYear(0000);

    }

    public Album(String name, Song[] tracks, String producer, int releaseYear) {
        setName(name);
        setTracks(tracks);
        setProducer(producer);
        setReleaseYear(releaseYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

        if (name == "" || name == null) {
            this.name = "No name specified";
        }
    }

    public Song[] getTracks() {
        return tracks;
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        String str = "Name: " + getName() + "\nProducer: " + getProducer() + "\nRelease Year: " + getReleaseYear() + "\nTrakcs: ";

        for (int i = 0; i < getTracks().length; i++) {
            if (tracks[i] != null) {
                str += tracks[i];
            }

        }
        return str;
    }
}
