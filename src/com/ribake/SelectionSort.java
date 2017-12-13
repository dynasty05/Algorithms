package com.ribake;

/**
 * Created by ribake on 09/12/2017.
 * An implementation of selection
 * sort algorithm.
 * PSEUDOCODE - IN PLACE SELECTION SORT:
 * ** KEY: Look for minimum in each unsorted segment of array and swap with current position
 * In My Own Words : Smallest first algorithm**
 * For each e in L : ---- n-1 times
 *  minimum = e ---- 1 time
 *
 *  // compare with rest of list to find smallest
 *  for i=1 to length(L) : --- n-2 times
 *      if L[i] < minimum : -- 1 time
 *          minimum = L[i] // this is the minimum found so far --- 1 time
 *      i = i+1 --- 1 time
 *
 *  // if minimum is less than e, swap places
 *  if minimum < e : ---- 1 time
 *      swap(e, minimum)  --- 1 time
 *
 *
 * TIME COMPLEXITY:
 * Inner loop: 2(n-2)
 * Outer loop: 2(n-1)
 * Total time: (n-1) + (n-1)2(n-2) + n-1 = 2(n-1) + 2nsq-2(n-1) = 0nsq
 */
public class SelectionSort {

    public int[] sortIncreasing(int[] unsorted){

        // loop till last but 1 element (as last element would be largest)
        for(int i = 0; i <= unsorted.length-2; i++){
            int min = unsorted[i];
            int curr = min;
            int swapIndex = -1;

            // loop through rest of array to find smallest element
            for(int j = i+1; j <= unsorted.length-1; j++){
                if(unsorted[j] < min){
                    min = unsorted[j];
                    swapIndex = j;
                }
            }

            // if minimum is no longer current element, swap both
            if(curr != min){
                unsorted[i] = min;
                unsorted[swapIndex] = curr;
            }
        }
        return unsorted;
    }

    public int[] sortDecreasing(int[] unsorted){
        // loop till last but 1 element (as last element would be largest)
        for(int i = 0; i <= unsorted.length-2; i++){
            int max = unsorted[i];
            int curr = max;
            int swapIndex = -1;

            // loop through rest of array to find smallest element
            for(int j = i+1; j <= unsorted.length-1; j++){
                if(unsorted[j] > max){
                    max = unsorted[j];
                    swapIndex = j;
                }
            }

            // if minimum is no longer current element, swap both
            if(curr != max){
                unsorted[i] = max;
                unsorted[swapIndex] = curr;
            }
        }
        return unsorted;
    }

//    public int[] sortDecreasing(int[] unsorted){
//        for(int i = 0; i < unsorted.length-1; i++){
//
//            int swapIndex = -1;
//
//            // rest of array
//            for (int j = i+1; j < unsorted.length; j++){
//                if(unsorted[j] > unsorted[i]){
//                    swapIndex = j;
//                }
//            }
//
//            // if index of maximum element is not same as current index, we need to swap
//            if(swapIndex >0 && unsorted[swapIndex] > unsorted[i]){
//                int temp = unsorted[i];
//                unsorted[i] = unsorted[swapIndex];
//                unsorted[swapIndex] = temp;
//            }
//        }
//        return unsorted;
//    }

}
