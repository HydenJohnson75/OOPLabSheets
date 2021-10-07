package LabSheet4.exercise5;





import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";

        TextArea text = new TextArea();
        text.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));

        JTextArea box= new JTextArea(6, 30);

        Book b1 = new Book(JOptionPane.showInputDialog("Please enter the title of your least-favourite book"), Double.parseDouble(JOptionPane.showInputDialog("Please enter the Price of your least-favourite Book")), JOptionPane.showInputDialog("Please enter the ISBN of your lease-favourite book"), Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of pages in your least-favourite book")));

        Book b2 = new Book(JOptionPane.showInputDialog("Please enter the title of your favourite book"), Double.parseDouble(JOptionPane.showInputDialog("Please enter the Price of your favourite Book")), JOptionPane.showInputDialog("Please enter the ISBN of your favourite book"), Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of pages in your favourite book")));

        box.append("Title                 Price       ISBN          Pages" + "\n\n" + b1.toString() + "\n\n" + b2.toString());

        JOptionPane.showMessageDialog(null, box, "Book Object Data", JOptionPane.INFORMATION_MESSAGE);


    }
}
