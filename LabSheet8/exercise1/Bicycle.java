package LabSheet8.exercise1;

import javax.swing.*;

public class Bicycle extends Vehicle {

    private int gearCount;
    private boolean hasBell;

    public Bicycle(){

    }

    public Bicycle(double price,double length,double height,double weight,String manufacturer,String model, int gearCount, boolean hasBell){
        super(price,length,height,weight,manufacturer,model);
        setGearCount(gearCount);
        setHasBell(hasBell);

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
        if(hasBell = true) {
            this.hasBell = hasBell;
        }
        else
            this.hasBell = false;
    }

    @Override
    public String toString() {
        String str =  super.toString()  +"\nGearCount: " + getGearCount() + "\nHas Bell: ";

        if(isHasBell() == false){
            str += "No";
        }
        else
            str += "Yes";

        return str;
    }
}
