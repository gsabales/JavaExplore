package com.javaexplore.control_flow_challenges;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(2345));
        System.out.println(sumFirstAndLastDigit(144));
        System.out.println(sumFirstAndLastDigit(65535));
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number) {
        int counter = number;
        int firstDigit = 0;
        int lastDigit = number % 10;

        if (number >= 0) {
            // To get first digit, divide number to 10 repeatedly before reaching 0 quotient.
            // Last quotient before reaching 0 is the first digit.
            while (counter != 0) {
                firstDigit = (counter < 10) ? counter : firstDigit;
                counter /= 10;
            }
            return firstDigit + lastDigit;
        }

        return -1;
    }
}
