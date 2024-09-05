/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basics;

import javax.swing.JOptionPane;

/**
 *
 * @author Labuser
 */
public class CircleCalulator {

    public static void main(String[] args) {
        StartApp();
    }

    //Circle Area Calculator
    public static void StartApp() {
        String InputNum = JOptionPane.showInputDialog("Enter num");
        double num = Double.parseDouble(InputNum);

        double area;
        area = Math.PI * Math.pow(num, 2); // this code is the sum, you change this depending on the shape
        System.out.println(area);



    }

}
