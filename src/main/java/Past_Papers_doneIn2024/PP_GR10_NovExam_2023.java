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
public class PP_GR10_NovExam_2023 {
 
    public static void main(String[] args) {
        String inputName =JOptionPane.showInputDialog("Enter name");
        while (inputName !=  "XXX") {
          inputName =JOptionPane.showInputDialog("Enter name");   
        } // while
        String inputWeight = JOptionPane.showInputDialog("Enter weight in kg of player");
         String inputHeight = JOptionPane.showInputDialog("Enter height in cm of player");
         double ave = oneRecruit(inputName,inputHeight ,inputWeight);
    }//main
 public static double oneRecruit(String name, double height , double weight) {
     System.out.println("Name:" +  name);
     
     double random = (int) Math.random()*11 +0;
     double score = height * random /weight   ;
     double total= 0;
     double ave =  0;
     System.out.println("Round one " + score);
     
     for (int i = 0; i <= 3; i++) {
      random = (int) Math.random()*11 +0;    
      score = height * random /weight   ; 
      total += score;
      System.out.println("Score for round " + i + ": " + score);
      
      
     ave = total/3;
     ave = ave *10;
     ave = (int) ave;
     ave = ave/10;
     
     }
     
     
    return ave; 
 }  
}
