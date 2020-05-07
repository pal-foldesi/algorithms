package org.palfoldesi.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    private int[] toSort = {951, -2, 0, 0, 43, 871, 9, 7, -5};
    private int[] expected = {-5, -2, 0, 0, 7, 9, 43, 871, 951};
    private BubbleSort bubbleSort = new BubbleSort();

    @DisplayName("Can sort an array of integers")
    @Test
    public void givenArrayOfNumbers_whenPassOptimizedSortingCalled_thenArrayIsSorted() {
        int[] actual = bubbleSort.sort(toSort);
        assertArrayEquals(expected, actual);
    }

    @DisplayName("Can sort a 2-element array of integers")
    @Test
    public void givenA2ElementArrayOfNumbers_whenPassOptimizedBubbleSortCalled_thenArrayIsSorted() {
        int[] toSort = {31, -5};
        int[] expected = {-5, 31};
        int[] actual = bubbleSort.sort(toSort);
        assertArrayEquals(expected, actual);
    }
}