package com.javaexplore.control_flow_challenges;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int counter = 0, average = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();

        try {
            double doubleAverage = (counter != 0) ? (sum/counter) : counter;
            average = (int)Math.round(doubleAverage);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("SUM = %d AVG = %d", (int)sum, average);
    }
}
