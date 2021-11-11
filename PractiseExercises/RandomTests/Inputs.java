package PractiseExercises.RandomTests;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        int a;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number");
        a = input.nextInt();

        if(((a % 2) ==0) && (a >=2 && a<=5)){
            System.out.println("\nNot Weird");
        }
        else if(((a % 2) == 0) && a>20){
            System.out.println("\nNot Weird");
        }
        else if(((a % 2) == 0) && (a >=6 && a<=20))
            System.out.println("\nWeird");
        else
            System.out.println("\nWeird");

    }
}
