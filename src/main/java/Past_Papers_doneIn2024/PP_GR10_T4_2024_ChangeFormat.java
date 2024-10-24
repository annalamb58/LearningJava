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
public class PP_GR10_T4_2024_ChangeFormat {
    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter date :dd/mm/yyyy");
        
        String day = input.substring(0, 2);
        String month = input.substring(3, 5);
        String year = input.substring(6);
        System.out.println(year + "-" + month + "-" + day);
        
    } //end of main method
    
} // end of class


