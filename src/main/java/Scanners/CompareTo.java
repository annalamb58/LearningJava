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
public class CompareTo {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("data//names.txt");
        Scanner sc = new Scanner(f);

        String mostAlphabetical = sc.next();
        String next = sc.next();

        while (sc.hasNext()) {
            int val = mostAlphabetical.compareTo(next);

            if (val > 0) {
                mostAlphabetical = next;
            }
        sc.next();
        }
    }
}
