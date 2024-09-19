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
        File docFile = new File("data//names.txt");
        Scanner docSc = new Scanner(docFile);

        String firstPerson = docSc.nextLine();
        Scanner personSc = new Scanner(firstPerson);
        String firstName = personSc.next();
        String lastName = personSc.next();
        while (personSc.hasNext()) {
            lastName = personSc.next();
        }

        String mostAlph = firstName;
        String longestName = lastName;

        while (docSc.hasNextLine()) {
            String nextPerson = docSc.next();
            personSc = new Scanner(nextPerson);
            firstName = personSc.next();
            lastName = personSc.next();
            while (personSc.hasNext()) {
                lastName = personSc.next();
            }

            if (firstName.compareTo(mostAlph) > 0) {
                mostAlph = firstName;
            }

            if (lastName.compareTo(longestName) > 0) {
                longestName = lastName;
            }

        }

        System.out.println("The most alph name is" + mostAlph);
        System.out.println("The longest name is" + longestName);
    }
}
