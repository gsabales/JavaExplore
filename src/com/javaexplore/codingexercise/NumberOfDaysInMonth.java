package com.javaexplore.codingexercise;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    /**
     * A year is a leap year if it is divisible by 4 but not by 100,
     * or it is divisible by 400
     */
    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year) {

        if ((month >= 1 && month <= 12) && (year >= 1 && year <=9999)) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                case 2: return isLeapYear(year) ? 29: 28;
                default: return -1;
            }
        }

        return -1;
    }
}
