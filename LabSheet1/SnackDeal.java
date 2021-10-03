package LabSheet1;
import javax.swing.*;

public class SnackDeal {
    public static void main(String[] args) {
        String name ="";
        String course = "";
        int snacks;


        name = JOptionPane.showInputDialog("Please Enter your name");
        course = JOptionPane.showInputDialog("Please Enter your course");
        snacks = Integer.parseInt(JOptionPane.showInputDialog("How many snakcs would you like ?"));

        int cost = snacks * 2;

        JOptionPane.showMessageDialog(null, "Name: " + name + "\nCourse: " + course + "\nSnacks: " + snacks + "\nCost: " + cost + " Euro","Receipt", JOptionPane.INFORMATION_MESSAGE);



    }
}
