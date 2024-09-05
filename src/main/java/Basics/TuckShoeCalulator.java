/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basics;

import javax.swing.JOptionPane;

/**
 *
 * @author Labuser
 */
public class TuckShoeCalulator {

    public static void main(String[] args) {
        StartApp();
        

    }
    public static void StartApp(){
        String inputCoke = JOptionPane.showInputDialog("Enter num Cokes");
        int numCokes = Integer.parseInt(inputCoke);
        
         String inputChip = JOptionPane.showInputDialog("Enter num Chips");
        int numChips = Integer.parseInt(inputChip);
                
        String inputChocolate = JOptionPane.showInputDialog("Enter num chocolates");
        int numChocolates = Integer.parseInt(inputChocolate);
        
        double cost = numCokes + 11.50 + numChips + 8.50 + numChocolates * 10;
        
        System.out.println("the total cost " + cost);
        
        
    }

}

