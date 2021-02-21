package com.javaexplore.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        int minimumElement = findMin(readElements(readInteger()));
        System.out.println("Minimum element from the array is: " + minimumElement );
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int totalElements = 0;

        System.out.print("How many numbers to be entered? ");

        if (scanner.hasNextInt()) {
            totalElements = scanner.nextInt();
        } else {
            System.out.println("Invalid value");
        }
        scanner.nextLine();

        return totalElements;
    }

    private static int[] readElements(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Input #" + (i + 1) + ":");
            myArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();

        return myArray;
    }

    private static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
