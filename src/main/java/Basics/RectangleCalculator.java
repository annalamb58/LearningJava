/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basics;

import javax.swing.JOptionPane;

/**
 *
 * @author Anna
 */
public class RectangleCalculator {
    public static void main(String[] args) {
        
        StartApp();
               
    }
  public static void StartApp() {
        String InputNum = JOptionPane.showInputDialog("Enter lengh");
        double num = Double.parseDouble(InputNum);
        
        String InputNum2 = JOptionPane.showInputDialog("Enter breath");
        double num2 = Double.parseDouble(InputNum2);

        double area;
        area = (num * num2) ; // this code is the sum, you change this depending on the shape
        System.out.println(area);



    }
}