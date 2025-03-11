/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author anna
 */
public class AsendingArrays {

    public static void main(String[] args) {
        int ouput[] = {};
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for (int i = 0; i < array.length; i++) {
            int lowest = array[i];
            int next = array[i+1];
            
            if (lowest > next) {
                lowest = next;
            }//if
           // output[] = output[] + lowest;
        } //for
       
    }//psvm
}//main
