package LabSheet2;
import javax.swing.*;
import java.util.Locale;

public class ComputerData {
    public static void main(String[] args) {
        int computerNumber = 1;
        String userInput,serialNumber,processor;
        float hdSpace,price;

        do{

            userInput = JOptionPane.showInputDialog("Please enter the serial number(<CR> to exit)");
            serialNumber = userInput.toUpperCase(Locale.ROOT);
            if(computerNumber == 1 && userInput.equals("")){
                JOptionPane.showMessageDialog(null,"No data entered","Exit", JOptionPane.ERROR_MESSAGE);
                break;
            }
            else if(userInput.equals("CR")){
                break;
            }
            System.out.println(serialNumber);   //Test for output


            userInput = JOptionPane.showInputDialog("Please enter the hard-disk space");
            hdSpace = Float.parseFloat(userInput);
            System.out.println(hdSpace);    //Test for output

            userInput = JOptionPane.showInputDialog("Please enter the Processor");
            processor = userInput;

            userInput = JOptionPane.showInputDialog("Please enter the price");
            price = Float.parseFloat(userInput);

            computerNumber++;
        }while(!(userInput.equals("")));
    }
}
