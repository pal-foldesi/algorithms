package org.palfoldesi.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    private int[] toSort = {951, -2, 0, 0, 43, 871, 9, 7, -5};
    private int[] expected = {-5, -2, 0, 0, 7, 9, 43, 871, 951};
    private BubbleSort bubbleSort = new BubbleSort();

    @DisplayName("Can sort an array of integers using the basic bubble sort algorithm")
    @Test
    public void givenArrayOfNumbers_whenBasicSortingCalled_thenArrayIsSorted() {
        int[] actual = bubbleSort.basicBubbleSort(toSort);
        assertArrayEquals(expected, actual);
    }

    @DisplayName("Can sort an array of integers using the pass optimized bubble sort algorithm")
    @Test
    public void givenArrayOfNumbers_whenPassOptimizedSortingCalled_thenArrayIsSorted() {
        int[] actual = bubbleSort.passOptimizedBubbleSort(toSort);
        assertArrayEquals(expected, actual);
    }
}