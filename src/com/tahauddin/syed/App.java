package com.tahauddin.syed;

import java.util.Arrays;

/**
 * Bubble Sort::
 * moving the max value to the last index and then
 * iterating it from starting and then moving the least max value to end -1
 * and processing it for entire loop.
 * This Algorithm has  time complexity is O(n2) :: O(n square) - Quadratic
 * for sorting 10 items in list it will take 100 steps
 */
public class App {

    public static void main(String[] args) {

        Integer[] intArray = {20,35,-15,-10,0,5,-3};
        System.out.println("Before Sort :: ");
        Arrays.stream(intArray).forEach(number -> {
            System.out.print(number + " , ");
        });

        System.out.println();
        for(Integer lastUnsortedArray = intArray.length-1; lastUnsortedArray >0 ; lastUnsortedArray--){
            for(int i = 0; i< lastUnsortedArray; i++){
                if(intArray[i] > intArray[i + 1]){
                    swapNumbers(intArray, i, i+ 1);
                }
            }
        }

        System.out.println("After Sort :: ");
        Arrays.stream(intArray).forEach(number -> {
            System.out.print(number + " , ");
        });
    }

    /**
     * swapping two numbers in array
     * @param intArray
     * @param i
     * @param j
     */
    public static void swapNumbers(Integer[] intArray, int i, int j){
        if(i == j){
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
