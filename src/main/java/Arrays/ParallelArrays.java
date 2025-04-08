/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anna
 */
public class ParallelArrays {
// class scope
    public static String[] names = new String[100];
    public static int[] marks = new int[100];
    public static int size = 0;

    public static void main(String[] args) {
        try {
            File f = new File("NamesandMarks.txt");
            Scanner scF = new Scanner(f);
            
            while (scF.hasNext()) {
               String line = scF.nextLine();
                Scanner scL = new Scanner(line);
                
                String name = scL.next();
                int mark = scL.nextInt();
                
                //adding to both arrays
                marks[size] = mark;
                names[size] = name;
                size ++;
                
            }//while
        } //try
        catch (FileNotFoundException ex) {
            Logger.getLogger(ParallelArrays.class.getName()).log(Level.SEVERE, null, ex);
        }//catch
        
        bubbleSortMarks();
        print();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        bubbleSortNames();
        print();
        
    } //main
    
    public static void bubbleSortMarks(){
       for (int i = size -1 ; i > 0; i--) {
           boolean sorted = true;
           
           for (int j = 0; j < i; j++) {
               if (marks[j] > marks[j+1]) {
               //comparing marks
                   
                  int tempMark = marks[j];
                  marks[j] = marks[j+1];
                  marks[j+1] = tempMark;
                  
                  String tempName = names[j];
                  names[j] = names[j+1];
                  names[j+1] = tempName;
                  
               }//if
               
           }//forj
           
        }//fori  
     
    }//bubble
    
    public static void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(names[i] + " " + marks[i]);
            
        }
    }//print
    
    
    
    public static void bubbleSortNames(){
       for (int i = size -1 ; i > 0; i--) {
           boolean sorted = true;
           
           for (int j = 0; j < i; j++) {
               if (names[j].compareToIgnoreCase(names[j+1]) > 0) {
                  //comparing names
                  
                  int tempMark = marks[j];
                  marks[j] = marks[j+1];
                  marks[j+1] = tempMark;
                  
                  String tempName = names[j];
                  names[j] = names[j+1];
                  names[j+1] = tempName;
                  
               }//if
               
           }//forj
           
        }//fori  
     
    }//bubble
}//class
