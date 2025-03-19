/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HYSTOU
 */
public class ResultsAnalysis {

    int[] results = new int[75];
    int size = 0;

    public static void main(String[] args) {
        try {
            Scanner fileSc = new Scanner(new File("results.txt"));
            while (fileSc.hasNext()) {
                String line = fileSc.nextLine();

                Scanner lineSc = new Scanner(line);
                // Q@ from bullet point three I do not know what to do.
                String name = " ";
                String surname = " ";
                int result = 0;

//                sort(results);
// I still do not understand question 5
// I know what it is wanting me todo but I do not know how to do it.
                int highest = 0;
                int lowest = 0;
                int ave = 0;
                int total = 0;

                if (result < lowest) {
                    lowest = result;
                }//low
                if (result > highest) {
                    highest = result;
                }//high
                total = total + result;
                //I do not know what to do here
                ave = total total * 1.0 / size;
                results[75];
                // I still do not understand question 7
                // I know what it is wanting me todo but I do not know how to do it.
            }//while
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ResultsAnalysis.class.getName()).log(Level.SEVERE, null, ex);
        }// caych

    }//psvm

    public static void sort(int[] results) {
        for (int i = results.length - 1; i < 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < 0; j++) {
                if (results[j] > results[j + 1]) {
                    int temp = results[j];
                    results[j] = results[j + 1];
                    results[j + i] = temp;

                    sorted = false;
                }// array if

            } // J for
            if (sorted) {
                break;
            } //break if
        }// I for
    }//sort

    public static int binarySearch(int[] results, int resultVal) {
        int start = 0;
        int end = results.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (results[middle] == resultVal) {
                return middle;
            } else if (results[middle] > resultVal) {
                end = middle - 1;
            }//elseif
            else {
                start = middle + 1;
            }//else
        }//while
        return -1;

    }//binarySearch
}//class
