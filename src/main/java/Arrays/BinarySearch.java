/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Anna
 */
public class BinarySearch {
    //14/03
    //only works on sorted arrays 
     // due to not having typed method, it is wrong
    public static void main(String[] args) {
         int[] array = {1, 6, 5, 99, 45};
        //public static in binarySearch (int[] array, int value) {
        int start = 0;
        int end = array.length -1;
        
        while (start <= end) {            
            int middle = (start + end)/2;
            
            if (array[middle] == value) {
                return middle;
            } else if(array[middle] > value) {
                end = middle-1;
            }//elseif
            else{
                start = middle +1;
            }//else
        }//while
        return -1;
        // } method
    }// psvm
}//class


// I understand what code does but I still cannot get the method header right