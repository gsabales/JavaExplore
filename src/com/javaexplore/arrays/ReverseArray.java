package com.javaexplore.arrays;


import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        reverse(new int[]{1, 5, 3, 11, 9, 15});
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfWay = array.length / 2;

        System.out.println("Array = " + Arrays.toString(array));

        for (int i = 0; i < halfWay; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
