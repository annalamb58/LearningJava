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
public class Driving_ex2_pg135 {

    public static void main(String[] args) {

        String inputage = JOptionPane.showInputDialog("Enter your age please");
        double age = Double.parseDouble(inputage);

        if (age < 18) {
            System.out.println("Too young to drive " + age);

        }
        else if (age > 75){
            System.out.println("Sorry you are over the legal age limit for driving " + age);
        
        }
        else if (age >= 18 || age <= 75) {
            System.out.println("Age okay. Have you got your licence? " + age);
        
            
        }
    }
}
