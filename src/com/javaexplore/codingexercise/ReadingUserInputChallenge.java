package com.javaexplore.codingexercise;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, counter = 1;

        while (counter <= 10) {
            System.out.printf("Enter number %d: ", counter);

            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The sum of all input numbers is " + sum);
    }

}
