package PractiseExercises.SP2Lab12.Exercise1;

import javax.swing.*;
import java.util.Arrays;

public class exercise1 {
    public static void main(String[] args) {
        float heights[] = new float[10];
        float average;
        float tallest;
        float smallest;

        readIn(heights);

        average = average(heights);

        tallest = tallestStudent(heights);

        smallest = smallestStudent(heights);

        JOptionPane.showMessageDialog(null,"Average Height: " + average + "m" +
                                      "\nSmallest Height: " + smallest + "m" + "\nTallest Height: " +
                                        tallest + "m");

        heightStats(heights);


        }

    public static void readIn(float heights[]){
        float height;

        for(int i = 0; i <heights.length; i++) {

            height = (Float.parseFloat(JOptionPane.showInputDialog("Please enter the height for student " + (i + 1) + ":")));

            heights[i] = height;
        }

    }

    public static float average(float heights[]){
        float total = 0;
        float average;

        for(int i = 0; i < heights.length; i++){
            total += heights[i];
        }
        average = (total/heights.length);

        return average;
    }

    public static float tallestStudent(float heights[]){
        float tallest=0;

        for(int i = 0; i <heights.length; i++){
            if(heights[i] > tallest){
               tallest = heights[i];
            }
        }

        return tallest;
    }

    public static float smallestStudent(float heights[]){
        float smallest=10000;


        for(int i = 0; i <heights.length;i++){
            if(heights[i] < smallest){
                smallest = heights[i];
            }
        }

        return smallest;
    }

    public static void heightStats(float heights[]){
        String heightsOver = "Heights over 1.7m is:\n";

        for(int i = 0; i <heights.length; i++){
            if(heights[i] > 1.7){
                heightsOver += heights[i] + " ";
            }
        }

        JOptionPane.showMessageDialog(null,heightsOver,"Heights over 1.7m", JOptionPane.INFORMATION_MESSAGE);
    }
}
