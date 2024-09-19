/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Anna
 */
public class MatchingLetters {

    public static void main(String[] args) throws FileNotFoundException {
        String sen = "The elephant tiptoed pasted the emu.";
        Scanner scDoc = new Scanner(sen);

        int points = 0;

        //Current Word
        String currentWord = scDoc.next();
        int currentWordlength = currentWord.length();
        char currentWordLast = currentWord.charAt(currentWordlength);
        //Next Word
        String nextWord = scDoc.next();
        int nextWordlength = nextWord.length();
        char nextWordLast = nextWord.charAt(0);

        while (scDoc.hasNext()) {
            if (currentWordLast == nextWordLast) {
                points++;
            }

        }

        System.out.println(points);

    }

}
