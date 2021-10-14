package LabSheet5.exercise3;

import javax.swing.*;

public class Thermometer {

    private int currentTemp;
    private int maximumTemp;
    private int minimumTemp;


    public Thermometer(){
        this(0);
        this.minimumTemp = Integer.MAX_VALUE;
        this.maximumTemp = Integer.MIN_VALUE;
    }

    public Thermometer(int currentTemp){
        this.setCurrentTemp(currentTemp);
        this.setMaximumTemp(currentTemp);
        this.setMinimumTemp(currentTemp);
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public void setMaximumTemp(int maximumTemp) {
        this.maximumTemp = maximumTemp;
    }

    public void setMinimumTemp(int minimumTemp) {
        this.minimumTemp = minimumTemp;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public int getMaximumTemp() {
        return maximumTemp;
    }

    public int getMinimumTemp() {
        return minimumTemp;
    }



    public  void setTemperature(){

        this.currentTemp = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temp of the first thermometer"));

        //this.maximumTemp = userTemp;
        //this.minimumTemp = userTemp;

        this.updateMaxMinTemp();

    }

    private void updateMaxMinTemp(){

        if(currentTemp >= maximumTemp){
            setMaximumTemp(currentTemp);
        }

        if(currentTemp <= minimumTemp){
            setMinimumTemp(currentTemp);
        }

    }

    public String toString(){
        return "Current temperature : " + getCurrentTemp() + "\nMaximum Temperature: " + getMaximumTemp() + "\nMinimum Temperature : " + getMinimumTemp();
    }

}
