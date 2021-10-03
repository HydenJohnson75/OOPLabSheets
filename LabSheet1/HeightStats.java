package LabSheet1;
import java.util.*;

public class HeightStats {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float heightOne,averageHeight = 0f,smallestHeightEntered=0f, percentageHeight=0;
        final float smallestHeight = 0.5464f, largestHeight = 2.72f, GLOBAL_AVERAGE_HEIGHT = 1.665f;
        int loopNumber = 1, valuesBetween = 0;


        while(loopNumber <= 6) {

            System.out.print("Loop " + loopNumber + " - Please enter height: ");
            heightOne = input.nextFloat();

            while (heightOne < smallestHeight || heightOne > largestHeight) {
                System.out.print("Loop " + loopNumber + " - Please re-enter height: ");
                heightOne = input.nextFloat();
                if (heightOne >= smallestHeight && heightOne <= largestHeight) {
                    break;
                }

            }
            averageHeight = averageHeight + heightOne;
            if(heightOne < largestHeight){
                smallestHeightEntered = heightOne;
            }

            if(heightOne >= 1.3 && heightOne <= 1.9){
                valuesBetween++;
            }

            if(heightOne > GLOBAL_AVERAGE_HEIGHT){
                percentageHeight++;
            }
            loopNumber++;
        }

        averageHeight = averageHeight/6;
        percentageHeight = (percentageHeight/6) * 100;

        System.out.println("The average heights entered is " + String.format("%.2f",averageHeight) + "\nThe smallest height entered is " + smallestHeightEntered + "\nThe number of height values betweeen 1.3m and 1.9m inclusive is " + valuesBetween + "\nThe percentage of height values exceeding the global average height is " + String.format("%.2f",percentageHeight) + "%");

    }
}
