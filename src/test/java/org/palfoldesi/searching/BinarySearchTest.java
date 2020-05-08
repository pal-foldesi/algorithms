package org.palfoldesi.searching;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private BinarySearch binarySearch = new BinarySearch();

    @DisplayName("Returns -1 if called on an empty array")
    @Test
    public void givenEmptyArray_whenBinarySearchCalled_thenMinusOneIsReturned() {
        int index = binarySearch.binarySearch(new int[0], 5);
        assertEquals(-1, index);
    }

    @DisplayName("Returns -1 if called with a key that is not present in the array")
    @Test
    public void givenArray_whenBinarySearchCalledWithInvalidKey_thenMinusOneIsReturned() {
        int[] arr = {3, 81, 83, 84, 172, 173, 987};
        int index = binarySearch.binarySearch(arr, 171);
        assertEquals(-1, index);
    }

    @DisplayName("Returns the right index if called on an array with only one element")
    @Test
    public void givenArrayWithOneElement_whenBinarySearchCalled_thenTheRightIndexIsReturned() {
        int[] arr = {3};
        int index = binarySearch.binarySearch(arr, 3);
        assertEquals(0, index);
    }

    @DisplayName("Returns the right index if called on an array with two elements")
    @Test
    public void givenArrayWithTwoElements_whenBinarySearchCalled_thenTheRightIndexIsReturnedLower() {
        int[] arr = {3, 81};
        int index0 = binarySearch.binarySearch(arr, 3);
        int index1 = binarySearch.binarySearch(arr, 81);
        assertEquals(0, index0);
        assertEquals(1, index1);
    }

    @DisplayName("Returns the right index if called on an array with an odd number of elements")
    @Test
    public void givenArrayWithOddNumberOfElements_whenBinarySearchCalled_thenTheRightIndexIsReturned() {
        int[] arr = {3, 57, 75, 91, 1401};
        int index0 = binarySearch.binarySearch(arr, 3);
        int index1 = binarySearch.binarySearch(arr, 57);
        int index2 = binarySearch.binarySearch(arr, 75);
        int index3 = binarySearch.binarySearch(arr, 91);
        int index4 = binarySearch.binarySearch(arr, 1401);
        assertEquals(0, index0);
        assertEquals(1, index1);
        assertEquals(2, index2);
        assertEquals(3, index3);
        assertEquals(4, index4);
    }

    @DisplayName("Returns the right index if called on an array with an even number of elements")
    @Test
    public void givenArrayWithEvenNumberOfElements_whenBinarySearchCalled_thenTheRightIndexIsReturned() {
        int[] arr = {3, 57, 75, 82, 91, 1401};
        int index0 = binarySearch.binarySearch(arr, 3);
        int index1 = binarySearch.binarySearch(arr, 57);
        int index2 = binarySearch.binarySearch(arr, 75);
        int index3 = binarySearch.binarySearch(arr, 82);
        int index4 = binarySearch.binarySearch(arr, 91);
        int index5 = binarySearch.binarySearch(arr, 1401);
        assertEquals(0, index0);
        assertEquals(1, index1);
        assertEquals(2, index2);
        assertEquals(3, index3);
        assertEquals(4, index4);
        assertEquals(5, index5);
    }
}