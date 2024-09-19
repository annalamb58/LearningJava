/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Anna
 */
public class LongestSurname {
    public static void main(String[] args) throws FileNotFoundException {
      File fileName = new File("names.txt");
        Scanner scMain = new Scanner(fileName);
        
        String line = scMain.nextLine();
        
        while (scMain.hasNext()) {
            Scanner scSurname = new Scanner(line) ;
            String surname = scSurname.next();
            
            
            
        }
        
        
    }
}
