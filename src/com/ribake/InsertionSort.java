package com.ribake;

/**
 * Created by ribake on 11/12/2017.
 * IMOW: Shift largest right
 * PSEUDOCODE:
 * // Given A(n)
 * // Assume first element is sorted
 * // For each subsequent element, find it's sorted position in sorted part of array
 * For i in 1 to n-1 :
 *  current = A[i]
 *  vacantIndex = i
 *
 *  // Compare backward. Shifting larger elements to the right
 *  For j in vacantIndex-1 to 0 :
 *      if A[j] > current :
 *          A[j+1] = A[j]
 *          // ** update vacant index **
 *          vacantIndex = j
 *
 * // Vacant index is sorted place of current
 *  A[vacantIndex] = current
 */
public class InsertionSort {

    public int[] sortAscending(int[] ints) {
        int length = ints.length;

        for(int i = 1; i < length; i++){
            int current = ints[i];
            int vacantIndex = i;

            // Compare backwards and shift right if greater than current
            for(int j = i-1; j >= 0; j--){
                // if greater, shift right and replace vacant index
                if(ints[j] > current){
                    ints[j+1] = ints[j];
                    vacantIndex = j;
                }

            }
            // place current in it's sorted place
            ints[vacantIndex] = current;
        }

        return ints;
    }
}
