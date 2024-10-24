/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Past_Papers_doneIn2024;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Anna
 */
public class PP_T1_Gr11_2021_Q4 {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter full name");
        Scanner sc = new Scanner(input);
        
        String firstName = sc.next() ;
        String lastName = "";
        
         while (sc.hasNext()) {
            lastName = sc.next() ;
             
        }
         System.out.println(firstName.toLowerCase() + "." + lastName + "@reddam.house") ;

    }
}
