package LabSheet4.exercise3;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";



        Book b1 = new Book();

        output += "Calling the no-arguement Book Constructor. The first book object details are: " + b1.toString();

        Book b2 = new Book("The DaVinci Code", 19.99, "345261722", 348);

        output += "\n\nCalling the multi-arguement Book Constructor. The second book object details are: " + b2.toString();

        JOptionPane.showMessageDialog(null, output, "Book Object Data", JOptionPane.INFORMATION_MESSAGE);


    }
}
