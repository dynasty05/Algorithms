package test;

import com.ribake.MergeSort;
import com.ribake.SelectionSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ribake on 12/12/2017.
 */
public class TestMergeSort {
    @Test
    public void shouldSortPositiveIntegersInIncreasingOrder(){
        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.sortAscending(new int[] {50, 9, 100, 66, 78, 52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{9, 50, 52, 66, 78, 100};
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void shouldSortPositiveIntegersInDecreasingOrder(){
        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.sortDescending(new int[] {50, 9, 100, 66, 78, 52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{100, 78, 66, 52, 50, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void shouldSortNegativeIntegersInIncreasingOrder(){
        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.sortAscending(new int[] {-50, -9, -100, -66, -78, -52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{-100, -78, -66, -52, -50, -9};
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void shouldSortNegativeIntegersInDecreasingOrder(){
        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.sortDescending(new int[] {-50, -9, -100, -66, -78, -52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{-9, -50, -52, -66, -78, -100};
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void shouldSortEqualIntegersAccordingly(){
        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.sortAscending(new int[] {50, 9, 9, 100, 66, 78, 52, 52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{9, 9, 50, 52, 52, 66, 78, 100};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void shouldSortMixedIntegersAccordingly(){
        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.sortAscending(new int[] {50, 9, -9, 100, 66, 78, 52, 52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{-9, 9, 50, 52, 52, 66, 78, 100};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnArrayOfOneElementAsSorted(){
        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.sortAscending(new int[] {50});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{50};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnArrayOfEqualElementsAsSorted(){
        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.sortDescending(new int[] {77, 77, 77, 77, 77});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{77, 77, 77, 77, 77};
        Assert.assertArrayEquals(expected, result);
    }

    private void drawLine(){
        System.out.println("++++++++++++++++++++++++++++");
    }

}
