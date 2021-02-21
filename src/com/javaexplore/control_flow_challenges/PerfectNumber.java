package com.javaexplore.control_flow_challenges;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        int counter = 1, factorSum = 0;

        if (number > 0) {
            while (counter < number) {
                factorSum += (number % counter == 0) ? counter : 0;
                if (factorSum == number) {
                    return true;
                }
                counter++;
            }
        }

        return false;
    }
}
