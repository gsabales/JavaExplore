package com.javaexplore.control_flow_challenges;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int largerNumber = Math.max(first, second);
        int greatestCommonDivisor = 0;

        if (first >=10 && second >= 10) {
            for (int counter = 1; counter <= largerNumber; counter++) {
                if ((first % counter) == 0 && (second % counter) == 0) {
                    greatestCommonDivisor = counter;
                }
            }

            return greatestCommonDivisor;
        }

        return -1;
    }
}
