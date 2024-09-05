/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author Anna
 */
public class HCF {

    public static void main(String[] args) {

        String Inputx = JOptionPane.showInputDialog("Enter number");
        int x = Integer.parseInt(Inputx);
        String Inputy = JOptionPane.showInputDialog("Enter number");
        int y = Integer.parseInt(Inputy);

        int lowest = x;
        if (x > y) {
            lowest = y;
        }

        int hcf = 1;

        for (int i = 1; i <= lowest; i++) {
            if (x % i == 0 && y % i == 0) {
                hcf = i;
            }
        }

        System.out.println(hcf);

    }
}
