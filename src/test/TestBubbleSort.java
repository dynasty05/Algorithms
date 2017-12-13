package test;

import com.ribake.BubbleSort;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by ribake on 10/12/2017.
 */
public class TestBubbleSort {
    @Test
    public void shouldSortPositiveIntegersInIncreasingOrder(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sortAscending(new int[] {50, 9, 100, 66, 78, 52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{9, 50, 52, 66, 78, 100};
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void shouldSortPositiveIntegersInDecreasingOrder(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sortDescending(new int[] {50, 9, 100, 66, 78, 52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{100, 78, 66, 52, 50, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void shouldSortNegativeIntegersInIncreasingOrder(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sortAscending(new int[] {-50, -9, -100, -66, -78, -52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{-100, -78, -66, -52, -50, -9};
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void shouldSortNegativeIntegersInDecreasingOrder(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sortDescending(new int[] {-50, -9, -100, -66, -78, -52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{-9, -50, -52, -66, -78, -100};
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void shouldSortEqualIntegersAccordingly(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sortAscending(new int[] {50, 9, 9, 100, 66, 78, 52, 52});
        for (int i=0; i < result.length; i++){
            System.out.println(result[i]);
        }
        drawLine();
        int[] expected = new int[]{9, 9, 50, 52, 52, 66, 78, 100};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void shouldSortMixedIntegersAccordingly(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sortAscending(new int[] {50, 9, -9, 100, 66, 78, 52, 52});
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
