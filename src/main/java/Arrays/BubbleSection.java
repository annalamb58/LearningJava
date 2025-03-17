/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author anna
 */
public class BubbleSection {
    //bubble sort
    public static void main(String[] args) {
        int[] array = {1,6,5,99,45};
        
        for (int i = array.length; i < 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+i] = temp;
            }
                    
                
                
            }
            
        }
    }
}
