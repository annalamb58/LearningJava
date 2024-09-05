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
public class MarkCalulator {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter your mark");
        double mark = Double.parseDouble(input);
        
         
       
         

        while (mark > 0 || mark < 100) {
            if (mark >= 80 && mark <= 100){
                System.out.println("A");
            }
            }
//            if (mark >= 70 || mark <= 79) {
//                System.out.println("B");
//
//            }
//            if (mark >= 60 || mark <= 69) {
//                System.out.println("C");
//
//            }
//            if (mark >= 50 || mark <= 59) {
//                System.out.println("D");
//
//            }
//
//            if (mark >= 0 || mark <= 49) {
//                System.out.println("F");
//
//            }
        
    }}
    

