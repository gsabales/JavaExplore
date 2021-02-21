package com.javaexplore.codingexercise;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        int days = (int)(minutes / 60 / 24);
        long years = days / 365;
        long remainingDays = days % 365;

        if (minutes >= 0) {
            System.out.printf("%d min = %d y and %d d\n", minutes, years, remainingDays);
        } else
            System.out.println("Invalid Value");
    }
}
