package com.ribake;

/**
 * Created by ribake on 10/12/2017
 * KEY: Bubble up largest element in each pass to end of array
 * IMOW: Bubble largest up
 * PSEUDOCODE:
 * Given A(n)
 * // For each element in array
 * For i in 0..n-1 : ---- n
 *
 * // Compare each adjacent element
 *  For j in 0..n-1 : ---- n
 *      largest = A[j]  ---- 1
 *      next = A[j+1]  ------ 1
 *
 *      // swap adjacent elements if LHS > RHS
 *      // and if we are in unsorted segment of array
 *      if j+1 <= n-sorted && largest > next : ---- 1
 *          A[j] = next  ------ 1
 *          A[j+1] = largest ----- 1
 *  // each time we leave outermost loop, one more is sorted
 *  sorted += 1  ----- 1
 * Inner loop: 5n
 * Outer loop: n x 5n = 5nsq
 * Time complexity = Onsq
 *
 */
public class BubbleSort {
    public int[] sortAscending(int [] array){
        for(int i = 0; i < array.length; i++){
            // keep count of number of sorted
            int sorted = 0;
            int unsorted = array.length - sorted;

            // compare each adjacent element
            for(int j = 0; j < array.length - 1; j++){
                int largest = array[j];
                int next = array[j+1];

                // check if we are not in sorted part of array to optimize algorithm
                if( (j+1 < unsorted) && (largest > next)){ // swap entries
                    array[j] = next;
                    array[j+1] = largest;
                }
            }

            // we know one new element has bubbled up
            sorted++;
        }
        return array;
    }

    public int[] sortDescending(int[] array){
        for(int i = 0; i < array.length; i++){
            // keep count of number of sorted
            int sorted = 0;
            int unsorted = array.length - sorted;

            // compare each adjacent element
            for(int j = 0; j < array.length - 1; j++){
                int smallest = array[j];
                int next = array[j+1];

                // check if we are not in sorted part of array to optimize algorithm
                if( (j+1 < unsorted) && (smallest < next)){ // swap entries
                    array[j] = next;
                    array[j+1] = smallest;
                }
            }

            // we know one new element has bubbled up
            sorted++;
        }

        return array;
    }
}
