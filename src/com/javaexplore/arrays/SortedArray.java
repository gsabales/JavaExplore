package com.javaexplore.arrays;

import java.util.Scanner;

public class SortedArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printArray(sortIntegers(getIntegers(5)));
    }

    public static int[] getIntegers(int arraySize) {
        int[] array = new int[arraySize];
        System.out.println("Enter " + arraySize + " number/s:\r");

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        return array;
    }

    public static int[] sortIntegers(int[] array) {
        int tempVar;

        // Bubble sort
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    tempVar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempVar;
                }
            }
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}