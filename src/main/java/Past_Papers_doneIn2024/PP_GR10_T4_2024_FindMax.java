/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Past_Papers_doneIn2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author anna
 */
public class PP_GR10_T4_2024_FindMax {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        File num = new File("numbers.txt");
        Scanner numSc = new Scanner(num);
        
        String currentNum = numSc.next();
        int currentNumInt = Integer.parseInt(currentNum);
        int highest = -1;
       
        while (numSc.hasNext()) {
            String nextNum = numSc.next();
            int nextNumInt = Integer.parseInt(nextNum);
            
            if (currentNumInt > nextNumInt) {
                highest = currentNumInt;
            } // if
        } //while
        
        System.out.println("The largest number is" + highest);
        
    }// main method
} // class
