package test;

import com.ribake.MergeSort;
import com.ribake.QuickSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ribake on 12/12/2017.
 */
public class TestQuickSort {
    @Test
    public void shouldReturnSingleElementArrayAsSorted(){
        QuickSort sut = new QuickSort();
        int[] testArray = new int[] {50};
        sut.quickSortAscending(testArray, 0, testArray.length - 1);
        for (int i=0; i < testArray.length; i++){
            System.out.println(testArray[i]);
        }
        drawLine();
        int[] expected = new int[]{50};
        Assert.assertArrayEquals(expected, testArray);
    }

    @Test
    public void shouldSortArrayOfTwoElements(){
        // arrange
        int[] testArray = new int[] {50, 10};
        QuickSort sut = new QuickSort();

        // act
        sut.quickSortAscending(testArray, 0, testArray.length - 1);
        for (int i=0; i < testArray.length; i++){
            System.out.println(testArray[i]);
        }
        drawLine();

        // assert
        int[] expected = new int[]{10, 50};
        Assert.assertArrayEquals(expected, testArray);
    }

    @Test
    public void shouldSortArrayOfThreeElements(){
        // arrange
        int[] testArray = new int[] {50, 10, 40};
        QuickSort sut = new QuickSort();

        // act
        sut.quickSortAscending(testArray, 0, testArray.length - 1);
        for (int i=0; i < testArray.length; i++){
            System.out.println(testArray[i]);
        }
        drawLine();

        // assert
        int[] expected = new int[]{10, 40, 50};
        Assert.assertArrayEquals(expected, testArray);
    }

    @Test
    public void shouldSortMixedIntegersAccordingly(){
        // arrange
        int[] testArray = new int[] {50, 9, -9, 100, 66, 78, 52, 52};
        QuickSort sut = new QuickSort();

        // act
        sut.quickSortAscending(testArray, 0, testArray.length - 1);
        for (int i=0; i < testArray.length; i++){
            System.out.println(testArray[i]);
        }
        drawLine();

        int[] expected = new int[]{-9, 9, 50, 52, 52, 66, 78, 100};
        Assert.assertArrayEquals(expected, testArray);
    }

    private void drawLine(){
        System.out.println("++++++++++++++++++++++++++++");
    }
}
