/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Past_Papers;

import javax.swing.JOptionPane;

/**
 *
 * @author Anna
 */
public class Trinngles_PP_2023 {

    public static void main(String[] args) {

        //  Q 1.1 (4 MARKS)
        String input1 = JOptionPane.showInputDialog("Enter 1st value");
        int angle1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Enter 2nd value");
        int angle2 = Integer.parseInt(input2);

        String input3 = JOptionPane.showInputDialog("Enter 3rd value");
        int angle3 = Integer.parseInt(input3);

        // Q 1.2 (4 MARKS)
        if (angle1 + angle2 + angle3 != 180) {

            System.out.println("IMPOSSIBLE");

            // Q 1.3 & 1.4
            if (angle1 + angle2 + angle3 == 180) {
                if (angle1 == angle2 && angle2 == angle3) {
                    System.out.println("EQUILATERAL"); 
                } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
                    System.out.println("ISOSCELES"); // Q 1.4
                } else if (angle1 != angle2 & angle1 != angle3 & angle2 != angle3) {

                    System.out.println("SCALENE"); // Q 1.4 

                    // TOTAL Q 1.4 (3 MARKS)
                    // [23 MARKS]
                }
            }

        }

    }
}
