package Arrays;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author anna
 */
public class PP_2025 {
    // Term 2 Practical Revision
    // PP Term 3 2024
//Question 1 

    public static int[] reps = new int[100]; // it is an int array with the capscity of 100 
    public static int size = 0; // a count to keep track of how many entries the array has
    //Question 2

    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileSc = new Scanner(new File("reps.txt")); // scanner for file
        while (fileSc.hasNext()) {
            String line = fileSc.nextLine(); //gets one line from the text file
            Scanner lineSc = new Scanner(line); // scanner for that line

            String name = lineSc.next();
            int rep = lineSc.nextInt();

            reps[size] = rep;
            size++;
        }//while
    }//main

    public static void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(" " + reps[i]);
            // you use System.out.print as it eill put all the units on one line   
        }//for
    }//print
    
    public static void sort(){
        //improvedBubbleSort
        for (int i = reps.length -1; i < 0; i--) {
         boolean sorted = true;
         
        }
  
    }//sort
}//class
//Questions
// when to use which sort
