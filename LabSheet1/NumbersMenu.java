package LabSheet1;
import javax.swing.*;

public class NumbersMenu {
    public static void main(String[] args) {
        String choice = "";
        String textUserNumber = "";
        int numberChoice;
        int loopNumber = 1;
        int userNumber;
        float factorial = 1;

        do{

            textUserNumber= JOptionPane.showInputDialog("--------Iteration " + loopNumber + "--------\n\nPlease enter any whole number:");
            userNumber = Integer.parseInt(textUserNumber);


            choice =JOptionPane.showInputDialog("What option would you like to do ? \n\n\n1.Odd Even\n2.Factorial\n3.Quit");
            numberChoice = Integer.parseInt(choice);

            switch(numberChoice){
                case 1:{

                        if(userNumber % 2 == 0)
                            {
                                JOptionPane.showMessageDialog(null,"Your number is even","Number Data", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                            else
                                {
                                    JOptionPane.showMessageDialog(null,"Your number is odd","Number Data", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }

                       }
                case 2:{
                            if(userNumber <0)
                            {
                                JOptionPane.showMessageDialog(null,"Cannot get the factorial of a negative number", "Number data", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else{
                                    for(int i = 2; i <= userNumber; i++)
                                    {

                                        factorial = factorial*i;
                                    }
                                JOptionPane.showMessageDialog(null,"The factorial of your number is " + factorial,"Number Data", JOptionPane.INFORMATION_MESSAGE);
                                }


                       }
                case 3:{

                            JOptionPane.showMessageDialog(null,"Quitting the program earlier than anticipated .... goodbye", "Number Data", JOptionPane.INFORMATION_MESSAGE);

                       }

            }

            loopNumber++;

          }

        while(numberChoice != 3);
    }
}
