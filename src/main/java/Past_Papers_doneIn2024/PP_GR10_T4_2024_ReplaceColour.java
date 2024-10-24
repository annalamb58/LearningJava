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
public class PP_GR10_T4_2024_ReplaceColour {
    
    public static void main(String[] args) {
        String sentence = JOptionPane.showInputDialog("Enter sentence");
        
            
        while (sentence.contains("orange")) {
            int pos = sentence.indexOf("orange");
            
            String before = sentence.substring(0, pos);
            String after = sentence.substring(pos, pos + 6);
            
            sentence = before + "red" + after;
        }//end of while loop
        
        System.out.println(sentence);
    } // end of main method
    
} // end of class
