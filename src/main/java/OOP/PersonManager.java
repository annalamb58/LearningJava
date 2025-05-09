/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anna
 */
// makes and uses objects
public class PersonManager {

    private Person[] people = new Person[100];
    private int size = 0;

    public PersonManager() {
        try {
            Scanner sc = new Scanner(new File("people.txt"));
            while (sc.hasNext()) {
                String line = sc.nextLine();
                
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                
                String name = lineSc.next();
                int age = lineSc.nextInt();
                double height = lineSc.nextDouble();
                double weight = lineSc.nextDouble();
                
                Person p = new Person(name, age, height, weight);
                people[size] = p;
                size++;
                
            }//while
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersonManager.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }   // construter**** the same name as the class 
    
    
    public double calculateAveBMI(){
        double sum =0;
        for (int i = 0; i < size; i++) {
            sum += people[i].calculateBMI();
            
        }// for
        return sum/size;
    }//AVEbmi
    
    public double getMaxBMI(){
        double maxBMI = people[0].calculateBMI();
        return maxBMI;
    }//maxBMI
    
    // sort people array
    public void sort(){
        for (int i = 0; i < size; i++) {
            for (int j = i+1 ; j < size; j++) {
                if (people[j].getAge() > people[i].getAge()) {
                    Person temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }//if
                
            }//forj
            
        }//fori
    }//sort
     public String toString(){
            String output = "";
            for (int i = 0; i < size; i++) {
                output += people[i].toString() + "\n";
                
            }//for
            return output;
        } // toString
        

}//class
