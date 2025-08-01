package com.practise;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        Arrays.sort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

