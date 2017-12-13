package test;

import com.ribake.BubbleSort;
import com.ribake.SelectionSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ribake on 11/12/2017.
 */
public class TestSelectionSort {
    @Test
    public void shouldSortPositiveIntegersInIncreasingOrder(){
        SelectionSort selectionSort = new SelectionSort();
        int[] result = selectionSort.sortIncreasing(new int[] {50, 9, 100, 66, 78, 52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{9, 50, 52, 66, 78, 100};
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void shouldSortPositiveIntegersInDecreasingOrder(){
        SelectionSort selectionSort = new SelectionSort();
        int[] result = selectionSort.sortDecreasing(new int[] {50, 9, 100, 66, 78, 52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{100, 78, 66, 52, 50, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void shouldSortNegativeIntegersInIncreasingOrder(){
        SelectionSort selectionSort = new SelectionSort();
        int[] result = selectionSort.sortIncreasing(new int[] {-50, -9, -100, -66, -78, -52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{-100, -78, -66, -52, -50, -9};
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void shouldSortNegativeIntegersInDecreasingOrder(){
        SelectionSort selectionSort = new SelectionSort();
        int[] result = selectionSort.sortDecreasing(new int[] {-50, -9, -100, -66, -78, -52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{-9, -50, -52, -66, -78, -100};
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void shouldSortEqualIntegersAccordingly(){
        SelectionSort selectionSort = new SelectionSort();
        int[] result = selectionSort.sortIncreasing(new int[] {50, 9, 9, 100, 66, 78, 52, 52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{9, 9, 50, 52, 52, 66, 78, 100};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void shouldSortMixedIntegersAccordingly(){
        SelectionSort selectionSort = new SelectionSort();
        int[] result = selectionSort.sortIncreasing(new int[] {50, 9, -9, 100, 66, 78, 52, 52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{-9, 9, 50, 52, 52, 66, 78, 100};
        Assert.assertArrayEquals(expected, result);
    }

    private void drawLine(){
        System.out.println("++++++++++++++++++++++++++++");
    }
}
