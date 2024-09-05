/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Anna
 */
public class Intials {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter full name");

        String name = "";
        String intials = "";

        Scanner sc = new Scanner(input);

        while (sc.hasNext()) {
            name = sc.next();

            if (sc.hasNext()) {
                intials = intials + name.charAt(0);

            }
        }
        System.out.println(intials + " " + name);

    }
}
