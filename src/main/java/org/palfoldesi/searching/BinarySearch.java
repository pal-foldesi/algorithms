package org.palfoldesi.searching;

public class BinarySearch {
    public int binarySearch(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int midpoint = (lo + hi) / 2;
            if (arr[midpoint] > key) {
                hi = midpoint - 1;
            } else if (arr[midpoint] < key) {
                lo = midpoint + 1;
            } else {
                return midpoint;
            }
        }
        return -1;
    }
}
