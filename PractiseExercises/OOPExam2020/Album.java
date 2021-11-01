package PractiseExercises.OOPExam2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Album {

    private String name;
    private Song tracks[];
    private String producer;
    private int releaseYear;


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
        if (name == null || name == "") {
            this.name = "No name specified";
        } else
            this.name = name;
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
        return "Name: " + getName() + "\n\nProducer: " + getProducer() + "\n\nRelease Year: " + getReleaseYear() + "\n\nTracks: " + Arrays.toString(tracks);


    }

    public int getNumberOfTracks() {
        return tracks.length;
    }

    public int getPlayingTime(){
        int totaltime = 0;
        for(int i=0;i < tracks.length;i++){
            totaltime+= tracks[i].getDuration();

        }

        return totaltime;
    }
}
