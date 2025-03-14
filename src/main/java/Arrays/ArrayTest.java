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
 * @author Anna
 */
public class ArrayTest {

    public static int[] nums = new int[100];
    public static int size = 0;

    public static void main(String[] args) {
        try {
            Scanner fileSc = new Scanner(new File("arraytestdoc.txt"));

            while (fileSc.hasNext()) {
                String line = fileSc.nextLine();

                Scanner lineSc = new Scanner(line);
                String name = lineSc.next();
                int age = lineSc.nextInt();
                nums[size] = age; // size starts at 0 so everytime the loop runs it will go to the next index eg 0 then 1 then 2
                size++;
            }//while hasnext
        }// try
        catch (FileNotFoundException ex) {
            Logger.getLogger(ArrayTest.class.getName()).log(Level.SEVERE, null, ex);
        }//catch

    }//psvm

    public static void BubbleSort() {
        // 1. I starts at the end
        // 2. J starts at the start ie 0
        // 3. compare if 2nd is smaller then first
        // 4. if true swap
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + i] = temp;
                }
            }

        }//bubblesort for
    }// bubblesort

    public static void SelectionSort() {
        // 1. I starts at the start
        // 2. J starts one after I
        // 3. compare if J less than I
        // 4. if true swap
    }// seletionsort

    public static int LinearSearch(int value) {
        return -1;
    } // linearsearch

}//class
