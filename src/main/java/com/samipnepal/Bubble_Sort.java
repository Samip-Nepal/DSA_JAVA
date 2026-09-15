package com.samipnepal;

import java.util.Arrays;

public class Bubble_Sort {
    static void main(String[] args) {
        int[] array = {9, 5, 4, 1, 5, 3, 5};
        int size = array.length;
        int temp;

        System.out.println("Original Array: " + Arrays.toString(array));
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println("Sorted Array: " + Arrays.toString(array));
        }
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
