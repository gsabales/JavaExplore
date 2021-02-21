package com.javaexplore.control_flow_challenges;

import java.util.Scanner;

public class MinAndMaxInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0, min = 0;
        int input;
        boolean firstEnter = true;

        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();

                // This will only be executed once to prevent min/max = 0
                if (firstEnter) {
                    min = input;
                    max = input;
                    firstEnter = false;
                }

                max = Math.max(input, max);
                min = Math.min(input, min);
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();

        System.out.printf("Maximum number entered is %d\n", max);
        System.out.printf("Minimum number entered is %d\n", min);
    }
}
