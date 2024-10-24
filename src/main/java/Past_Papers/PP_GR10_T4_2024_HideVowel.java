/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Past_Papers;

import javax.swing.JOptionPane;
import org.w3c.dom.CharacterData;

/**
 *
 * @author anna
 */
public class PP_GR10_T4_2024_HideVowel {
    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter sentence");
        String output = "";
        
        for (int i = 0; i < input.length(); i++) {
            char current = input.toLowerCase().charAt(i);
           if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u' ) { 
            output += "*";
            
        } else {
               output += input.charAt(i);
               
           } // if
        
        } // for
        System.out.println(output);
    } // main
} //CLASS
