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
public class LargerOfTwo_ex2_pg134 {

    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("Enter first number");
        double num1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Enter second number");
        double num2 = Double.parseDouble(input2);

        if (num1 > num2) {
            System.out.println("The first number you entered was larger then the second");
        }
        else if (num1 < num2) {
            System.out.println("The second number you entered was larger then the first");
        }
        
        else if (num1 == num2){
            System.out.println("The first and second number are equal to eachother");
        
        
        }
    }
}
