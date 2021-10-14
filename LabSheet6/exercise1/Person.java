package LabSheet6.exercise1;

import javax.swing.*;

public class Person {

    private String firstName = "";
    private String lastName = "";

    public Person(){
        this.firstName = "Not Supplied";
        this.lastName = "Not Supplied";
    }

    public Person(String firstName, String lastName){
       firstName = JOptionPane.showInputDialog("Please enter first name");
       lastName = JOptionPane.showInputDialog("Please enter last name");
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String toString(){
        return "First Name: " + getFirstName() + "    Last Name: " + getLastName();
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

}
