package LabSheet1;
import javax.swing.*;

public class CyclistSponsor {
    public static void main(String[] args) {

        String name ="";
        int amountOfKm, amountOfKmLeft;
        final double tenKmCalculation = 1.75;//LOWER_R
        final double tenKmPlusCalculation =2.50;
        float total;

        name = JOptionPane.showInputDialog("Please Enter your name");
        amountOfKm = (Integer.parseInt(JOptionPane.showInputDialog("Please Enter th amount of Km Cycled")));

        amountOfKmLeft = amountOfKm - 10;

        if(amountOfKm < 10){
            total = (float) (amountOfKm * tenKmCalculation);
        }
        else if(amountOfKm == 10){
            total = (float) (10 * tenKmCalculation);
        }
        else{
            total = (float) ((10 * tenKmCalculation) + (amountOfKmLeft * tenKmPlusCalculation));
        }

        JOptionPane.showMessageDialog(null, "Name: " + name + "\nDistance Cycled: " + amountOfKm + "\nSponsorship amount due: " + String.format("%.2f",total) + " Euro", "Receipt",JOptionPane.INFORMATION_MESSAGE);
    }
}
