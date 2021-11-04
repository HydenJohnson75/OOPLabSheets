package LabSheet8.exercise1;

public class Bicycle extends Vehicle {

    private int gearCount;
    private boolean hasBell;

    public Bicycle(){

    }

    public Bicycle(int gearCount, boolean hasBell){



    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gearCount=" + gearCount +
                ", hasBell=" + hasBell +
                '}';
    }
}
