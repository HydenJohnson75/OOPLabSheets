package LabSheet1;
import java.util.*;

public class TextAnalyser {
    public static void main(String[] args) {

        int loopNumber = 1, lowerCaseVowels = 0, numberOfWords = 0, numbersOfCharacters, i = 0,numberOfSpaces = 0, timesEdAppears=0;
        String pieceOfText;

        Scanner input = new Scanner(System.in);

        do{

            System.out.print("Please enter piece of text " + loopNumber + ": ");
            pieceOfText = input.nextLine();

            i=0;
            lowerCaseVowels = 0;
            numberOfSpaces = 0;
            numberOfWords = 0;
            timesEdAppears =0;
            numbersOfCharacters = pieceOfText.length();

            while( i < pieceOfText.length())
            {
                if(pieceOfText.charAt(i) == 'a' || pieceOfText.charAt(i) == 'e' || pieceOfText.charAt(i) == 'i' || pieceOfText.charAt(i) == 'o' || pieceOfText.charAt(i) == 'u'){


                    lowerCaseVowels ++;

                }

                if(pieceOfText.charAt(i) == ' '){
                    numberOfSpaces++;
                }

                numberOfWords = numberOfSpaces + 1;

                if(pieceOfText.charAt(i) == 'e' && pieceOfText.charAt(i+1) =='d'){
                    timesEdAppears++;
                }

                i++;

            }

            System.out.println(numbersOfCharacters + "\n" + lowerCaseVowels + "\n" + numberOfWords + "\n" + timesEdAppears);

            loopNumber++;

        }
        while(loopNumber <= 3);


    }
}
