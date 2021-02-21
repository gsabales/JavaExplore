package com.javaexplore.control_flow_challenges;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number) {
        int counter = number;
        int evenSum = 0, digit;

        if (number >= 0) {
            do {
                digit = counter % 10;
                evenSum += ((digit % 2) == 0) ? digit : 0;
                counter /= 10;
            } while (counter != 0);

            return evenSum;
        }

        return -1;
    }
}
