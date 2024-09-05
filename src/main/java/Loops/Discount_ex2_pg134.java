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
public class Discount_ex2_pg134 {

    public static void main(String[] args) {

        String money = JOptionPane.showInputDialog("Enter money spent");
        double inputmoney = Double.parseDouble(money);
        double discount = 0;
        if (inputmoney >= 100) {
            discount = inputmoney * 10 / 100;

            System.out.println(discount);
        }
        System.out.println(inputmoney - discount);
    }
}
