/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Anna
 */
// encapsultion **** bundling methods and data together into objects 
// making objects
public class Person {
    // non-static variables
    // each object gets a copy 
    private String name;
    private int age;
    private double height;
    private double weight;
 
    // static variables
    // all objects share this variable
    public static int numPeople = 0;
    
    
    public Person (String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }// constructor

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }
// source, insert code, setter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
    
//  source, insert code, getter  
    
    
    public double calculateBMI(){
        return weight/Math.pow(height, 2);
    }
    
    public void printName(){
        System.out.println(name);
    }
    
    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }
}//class
