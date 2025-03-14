/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Anna
 */
public class ImprovedBubbleSort {
//14/03
    public static void main(String[] args) {
        int[] array = {1, 6, 5, 99, 45};
        improvedBubble(array);

    }//psvm
    
    public static void improvedBubble(int[] arr){
        for (int i = arr.length - 1; i < 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < 0; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + i] = temp;

                    sorted = false;
                }// array if

            } // J for
            if (sorted) {
                break;
            } //break if
        }
    }
    
    
}//class

//Questions
// ln 27, why do we break
// what improves this sort to og bubble
//ln 22 why are we seeting sorted to false
// how to write og method
