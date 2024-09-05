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
public class ForWhile {
     public static void main(String[] args) {
       
         int total = 0;
         
         String inputStr = JOptionPane.showInputDialog("Enter a number");
         int num = Integer.parseInt(inputStr);
         
         while (num > 0){
            total = total + num;
             
             
            inputStr = JOptionPane.showInputDialog("Enter a number");
            num = Integer.parseInt(inputStr);
         }
    
    }
}