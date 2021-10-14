package LabSheet5.exercise4;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        String output = "";

        BankAccount b1 = new BankAccount();

        output += "Calling the no-arguement BankAccount constructor: The first BankAccount details are:" + b1.toString();

        BankAccount b2 = new BankAccount("Richy Rich",2342343,0.75);

        output += "\n\nCalling the multi-arguement BankAccount constructor: The second BankAccount details are:" + b2.toString();


        BankAccount b3 = new BankAccount();

        b3.setIntrestRate(0.5);

        output += "\n\nCalling the setInterestRate() method: The first BankAccount details are:" + b3.toString();


        BankAccount b4 = new BankAccount();

        b4.setIntrestRate(0.5);
        b4.setNumber(2342343);
        b4.setOwner("Richy Rich");

        output += "\n\n.Calling the setInterestRate() method: The second BankAccount details are:" + b4.toString();

        JOptionPane.showMessageDialog(null,  output, "BankAccount Object Data", JOptionPane.INFORMATION_MESSAGE);

    }
}
