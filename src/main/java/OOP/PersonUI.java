/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Anna
 */
public class PersonUI {
    //the personUI (text interface) using the objects (in Person)
    // using objects
    //Person p = new Person ("Anna", 18, 5,2);
    public static void main(String[] args) {
         PersonManager pm = new PersonManager(); 
         System.out.println(pm.toString());
         pm.sort();
    } // psvm     
}//class