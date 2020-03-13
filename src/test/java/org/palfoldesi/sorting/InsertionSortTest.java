package org.palfoldesi.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {
    private int[] toSort = {951, -2, 0, 0, 43, 871, 9, 7, -5};
    private int[] expected = {-5, -2, 0, 0, 7, 9, 43, 871, 951};
    private InsertionSort insertionSort = new InsertionSort();

    @DisplayName("Can sort an array of integers")
    @Test
    public void givenArrayOfNumbers_whenInsertionSortingCalled_thenArrayIsSorted() {
        int[] actual = insertionSort.insertionSort(toSort);
        assertArrayEquals(expected, actual);
    }
}