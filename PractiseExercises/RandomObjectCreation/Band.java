package PractiseExercises.RandomObjectCreation;

public class Band {
    private String bandName;
    private int startYear;
    private String genre;

    public Band(String bandName, int startYear, String genre) {
        setBandName(bandName);
        setStartYear(startYear);
        setGenre(genre);
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "BandName :" + getBandName()  + "StartYear: " + getStartYear() + "Genre: " + getGenre();

    }
}
