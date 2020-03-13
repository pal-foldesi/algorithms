package org.palfoldesi.sorting;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int i = j - 1;
            int key = arr[j];
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
        return arr;
    }
}