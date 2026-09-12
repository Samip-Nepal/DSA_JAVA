package com.samipnepal;

public class Demo {
    static void main(String[] args) {

        //int[] array = {84, 74, 56, 87, 98};
        int[] array = new int[1000];
        int target = 900;
        int result1 = linearsearch(array, target);
        int result2 = binarysearch(array, target);
        if (result1 != -1) {

            System.out.println("Element index " + result2);
        } else {
            System.out.println("NOt found");
        }
    }

    public static int linearsearch(int[] array, int target) {
        int i;
        int steps = 0;

        for (i = 0; i < array.length; i++) {
            steps++;
            if (array[i] == target) {
                System.out.println("Number of the steps taken linear " + steps);
                return 1;
            }
        }
        System.out.println("Number of the steps taken linear " + steps);
        return -1;
    }

    public static int binarysearch(int[] array, int target) {
        int left = 0;
        int steps = 0;
        int right = array.length - 1;
        while (left <= right) {
            steps++;

            int mid = (left + right) / 2;
            if (array[mid] == target) {
                System.out.println("Number of the steps taken binary " + steps);
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
        System.out.println("Number of the steps taken binary " + steps);
        return -1;
    }
}
