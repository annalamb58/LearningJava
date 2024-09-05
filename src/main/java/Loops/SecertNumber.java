/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author Anna
 */
public class SecertNumber {

    public static void main(String[] args) {

        int secretNum = 62;

        String guess = JOptionPane.showInputDialog("Enter guess");
        int numguessed = Integer.parseInt(guess);

        int numloops= 0;

        

        while (numguessed != secretNum) {
            numloops ++ ;
                    
            if (numguessed > secretNum) {
                System.out.println("Higher than the secret number");
            }
            if (numguessed < secretNum) {
                System.out.println("Lower than the secret number");

            }
            guess = JOptionPane.showInputDialog("Enter guess");
            numguessed = Integer.parseInt(guess);
        }
                System.out.println("Correct");
         
            System.out.println(numloops); 
    }
}
