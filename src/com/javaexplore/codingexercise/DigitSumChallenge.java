package com.javaexplore.codingexercise;

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int wholeNumber) {
        int sum = 0;
        int counter = wholeNumber;

        if (wholeNumber >=10) {
            while (counter != 0) {
                sum += counter % 10;
                counter /= 10;
            }
            return sum;
        }
        return -1;
    }
}
