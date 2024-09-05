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
public class RightWord {
    public static void main(String[] args) {
        
        String word = JOptionPane.showInputDialog("Enter word") ;
        char lastletter = word.charAt(word.length()-1);
        char firstletter = word.charAt(lastletter) ;
        int count = 0;
        
       while (lastletter == firstletter) {
           count ++;
           String newWord = JOptionPane.showInputDialog("Enter new word") ;
           firstletter = newWord.charAt(0) ;
           if (firstletter == lastletter) {
              String new2Word = JOptionPane.showInputDialog("Enter new word") ;
          
           }
           
       }
       if (lastletter != firstletter) {
               System.out.println(count);;
           }
    }
}
