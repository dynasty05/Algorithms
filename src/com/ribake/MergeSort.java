package com.ribake;

/**
 * Created by ribake on 12/12/2017.
 * IMOW: Break input down till single and merge upwards
 * PSEUDOCODE:
 * MergeSort(A(n):
 *  if A.size() == 1:
 *      return A
 *
 *  // split A into two halves
 *  sizeL = n/2
 *  sizeR = n - n/2
 *
 *  // initalize both arrays
 *  init(L(sizeL)
 *  init(R(sizeR))
 *
 *  //populate both arrays
 *  For i in 0...sizeL-1
 *      L[i] = A[i]
 *
 *  For j in 0...sizeR-1
 *      R[j] = A[j]
 *
 *  // Call same function on broken down array (recurse)
 *  MergeSort(L)
 *  MergeSort(R)
 *
 *  Merge(L, R, A)
 *
 *  Merge(L(l), R(r), A):
 *  // loop through both arrays and pick smallest into A
 *  i = 0
 *  j = 0
 *  a = 0
 *  while i<l && j<r :
 *      if L[i] < R[j] :
 *          A[a] = L[i]
 *          i = i +1
 *          a = a + 1
 *      if R[j] < L[i] :
 *          A[a] = R[j]
 *          j = j + 1
 *          a = a + 1
 *
 *  while i < l :
 *      A[a] = L[i]
 *
 *  while j < r :
 *      A[a] = R[j]
 *
 *
 *
 */
public class MergeSort {

    public int[] sortAscending(int[] array){
        // base condition
        if (array.length == 1) {
            return array;
        }
        // find mid point and sizes of sub arrays
        int sizeL = (int)array.length/2;
        int sizeR = array.length - sizeL;
        int mid = sizeL;

        // initialise sub arrays
        int[] left = new int[sizeL];
        int[] right = new int[sizeR];

        // populate left array
        for (int i = 0; i < sizeL; i++){
            left[i] = array[i];
        }

        for (int j = 0; j < sizeR; j++){
            right[j] = array[mid];
            mid ++;
        }

        // recursively call function
        sortAscending(left);
        sortAscending(right);

        // merge sorted left and right sub-arrays
        // into original array
        mergeAscending(left, right, array);
        return array;

    }

    // merge sorted left and right sub-arrays
    // and overwrite original array
    private void mergeAscending(int[] left, int[] right, int[] merged){
        // loop through both arrays, picking smaller element into sorted array
        int l, r, m;
        l =  r = m = 0;
        while (l < left.length && r < right.length){
            if(left[l] <= right[r]){
                merged[m] = left[l];
                l++;
                m++;
                continue;
            }

            if(right[r] <= left[l]){
                merged[m] = right[r];
                r++;
                m++;
                continue;
            }
        }

        // since one array would get exhausted before the other
        // and while loop above would be false in such case
        while(l < left.length){
            merged[m] = left[l];
            l++;
            m++;
        }
        while (r < right.length){
            merged[m] = right[r];
            r++;
            m++;
        }
    }

    public int[] sortDescending(int[] array){
        // base condition
        if (array.length == 1) {
            return array;
        }
        // find mid point and sizes of sub arrays
        int sizeL = (int)array.length/2;
        int sizeR = array.length - sizeL;
        int mid = sizeL;

        // initialise sub arrays
        int[] left = new int[sizeL];
        int[] right = new int[sizeR];

        // populate left array
        for (int i = 0; i < sizeL; i++){
            left[i] = array[i];
        }

        for (int j = 0; j < sizeR; j++){
            right[j] = array[mid];
            mid ++;
        }

        // recursively call function
        sortDescending(left);
        sortDescending(right);

        // merge sorted left and right sub-arrays
        // into original array
        mergeDescending(left, right, array);
        return array;

    }

    // merge sorted left and right sub-arrays
    // and overwrite original array
    private void mergeDescending(int[] left, int[] right, int[] merged){
        // loop through both arrays, picking smaller element into sorted array
        int l, r, m;
        l =  r = m = 0;
        while (l < left.length && r < right.length){
            if(left[l] >= right[r]){
                merged[m] = left[l];
                l++;
                m++;
                continue;
            }

            if(right[r] >= left[l]){
                merged[m] = right[r];
                r++;
                m++;
                continue;
            }
        }

        // since one array would get exhausted before the other
        // and while loop above would be false in such case
        while(l < left.length){
            merged[m] = left[l];
            l++;
            m++;
        }
        while (r < right.length){
            merged[m] = right[r];
            r++;
            m++;
        }
    }
}
