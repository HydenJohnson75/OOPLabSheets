package PractiseExercises.OOPExam2020;

import javax.swing.*;
import java.awt.*;

public class TestAlbum {
    public static void main(String[] args) {

        JTextArea textArea = new JTextArea(14,30);

        Font textAreaFont = new Font("monospaced",Font.PLAIN,12);

        textArea.setText(String.format("%-16s%-16s%-16s\n","Track Number","Title","Artist"));

        Song Song[] = new Song[5];

        Song s1 = new Song("Sugar Baby Love","Rubettes","Pop",136,197);
        Song s2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
        Song s3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);
        Song s4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);
        Song s5 = new Song("House of Fun", "Madness", "Pop", 178, 1984);



        Song[0] = s1;
        Song[1] = s2;
        Song[2] = s3;
        Song[3] = s4;
        Song[4] = s5;

        Album a1 = new Album("Now that’s what I call music 98",Song, "Universal Music", 2016);

        JOptionPane.showMessageDialog(null,a1,"Album Information",JOptionPane.INFORMATION_MESSAGE);


    }

}
