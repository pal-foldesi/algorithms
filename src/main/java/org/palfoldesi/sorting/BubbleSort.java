package org.palfoldesi.sorting;

public class BubbleSort {
    private boolean isNotSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public int[] basicBubbleSort(int[] arr) {
        while (isNotSorted(arr)) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        return arr;
    }

    public int[] passOptimizedBubbleSort(int[] arr) {
        int numberOfPasses = arr.length - 1;
        while (isNotSorted(arr)) {
            for (int i = 0; i < numberOfPasses; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            numberOfPasses--;
        }

        return arr;
    }
}