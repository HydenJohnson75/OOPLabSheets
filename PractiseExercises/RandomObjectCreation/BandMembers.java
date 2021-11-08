package PractiseExercises.RandomObjectCreation;

public class BandMembers extends Band {
    private String name;
    private String instrument;

    public BandMembers(String bandName, int startYear, String genre,String name, String instrument) {
        super(bandName, startYear,genre);
        setName(name);
        setInstrument(instrument);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Name: " + getName()  + "Instrument: " + getInstrument();
    }
}
