package com.ribake;

/**
 * Created by ribake on 12/12/2017.
 */
public class QuickSort {
    public void quickSortAscending(int[] array, int start, int end) {

        // base condition: start must be less than end as
        // algorithm could arrive at invalid indexes.
        if(start < end){
            // Partition
            int pivotIndex = partition(array, start, end);

            // Call function recursively
            quickSortAscending(array, start, pivotIndex - 1);
            quickSortAscending(array, pivotIndex + 1, end);
        }
        // if index range is invalid, do nothing, sub array is sorted
    }


    /**
     * Rearrange array such that the last element becomes pivot
     * and lower elements appear before pivot, and larger elements
     * after pivot.
     * @param array
     * @param start start index
     * @param end end index
     */
    public int partition(int[] array, int start, int end){
        // make end element pivot element
        int pivotElement = array[end];

        // this will be the final index of the pivot element
        int pivotIndex = start;

        // loop through array, swapping elements lower than
        // pivot element with the current element
        for(int i = start; i < end; i++){
            if(array[i] <= pivotElement){
                // swap places with the pivot index
                int temp1 = array[i];
                int temp2 = array[pivotIndex];
                array[i] = temp2;
                array[pivotIndex] = temp1;
                pivotIndex++;
            }
        }

        // now swap the last entry with the element at the pivotIndex
        int temp1 = array[pivotIndex];
        array[pivotIndex] = pivotElement;
        array[end] = temp1;

        return pivotIndex;

    }
}
