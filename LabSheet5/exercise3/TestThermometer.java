package LabSheet5.exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {
        String output = "";

        Thermometer t1 = new Thermometer(35);

        output += "Calling the single-argumeant constructor.... setting the temperature of the first thermometer to 35C\nFirst thermometer:\n" +t1.toString() ;

        Thermometer t2 = new Thermometer();

        output += "Calling the no-argumeant constructor.... setting the temperature of the Second thermometer to 0C\nSecond thermometer:\n" + t2.toString();

        Thermometer t3 = new Thermometer();

        t2.setTemperature(25);

        output += "Calling the setTemperature().... setting the temperature of the Third thermometer to 25C\nThird thermometer:\n" + t2.toString();

        JOptionPane.showMessageDialog(null, "*****Thermometer Testing***** \n\n" + output, "",JOptionPane.INFORMATION_MESSAGE);
    }
}
