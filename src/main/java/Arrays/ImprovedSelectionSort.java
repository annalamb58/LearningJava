    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Anna
 */
public class ImprovedSelectionSort {
//14/03
    public static void main(String[] args) {
        int[] array = {1, 6, 5, 99, 45};
        for (int i = 0; i < array.length; i++) {
            int lowestIndex = i;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < array[lowestIndex]) {
                    lowestIndex = j;
                }//if
            }// J for

            int temp = array[lowestIndex];
            array[lowestIndex] = array[i];
            array[i] = temp;

        }// I for
    }//psvm
}//class

// Questions
// is lowestIndex another temp
// why does lowestIndex improve seletionsort
