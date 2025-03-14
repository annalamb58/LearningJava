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
public class ArraysTestCode {
    //14/03
    public static void main(String[] args) {
        try {
            int[] array = new int [100];
            int size = 0;
            Scanner fileSc = new Scanner(new File("arraytestdoc.txt"));
            
            while (fileSc.hasNext()) {                
                array[size] = fileSc.nextInt();
                size++;
            }//while
            
            int total = 0;
            int max = array[0];
            for (int i = 0; i < size; i++) {
                total += array[i];
                if (array[i]>max) {
                    max =array[i];
                }//if
                
            }//for
            double average = total *1.0/size;
        } //try
        catch (FileNotFoundException ex) {
            Logger.getLogger(ArraysTestCode.class.getName()).log(Level.SEVERE, null, ex);
        }//catch
    }//psvm
}//class


//Questions 
//How is max being used, what is it doing
//what are the methods called