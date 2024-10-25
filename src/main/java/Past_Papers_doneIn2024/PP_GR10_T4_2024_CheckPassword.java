/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Past_Papers_doneIn2024;

import javax.swing.JOptionPane;

/**
 *
 * @author anna
 */
public class PP_GR10_T4_2024_CheckPassword {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter password");
                
        boolean isLong = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isDigit = false;

        if (input.length() >= 8) {
            isLong = true;
        } //if

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (Character.isDigit(current)) {
                isDigit = true;
            } // is digit

            if (Character.isUpperCase(current)) {
                isUpperCase = true;
            } // is uppercase

            if (Character.isLowerCase(current)) {
                isLowerCase = true;
            } // is lower case

        } // for
       
        if (isLong && isDigit && isUpperCase && isLowerCase) {
            System.out.println(" Password is strong");
        } else {
            System.out.println("Password is weak");
        } // if true

    } // main

}//class
