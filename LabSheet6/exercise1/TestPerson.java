package LabSheet6.exercise1;

import javax.swing.*;

public class TestPerson {

    public static void main(String[] args) {

        String output = "", firstName = "", lastName = "";



        Person p1 = new Person();

        output += "Calling the Person() constructor .....\nValue of the first Person object is: " + p1.toString();

        Person p2 = new Person(firstName = JOptionPane.showInputDialog("Please enter the first name"),lastName = JOptionPane.showInputDialog("Please enter the last name"));

        output += "\n\nCalling the Person(String, String) constructor after getting user-supplied values.....\n Value of the second person is: " + p2.toString();


        JOptionPane.showMessageDialog(null, "*****Person Class Testor*****\n\n" + output);

    }

}
