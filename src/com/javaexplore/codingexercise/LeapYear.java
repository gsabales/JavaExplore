package com.javaexplore.codingexercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeapYear {

    public static void main(String[] args) {
        int[] years = {1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600, 1600, 2000, 2400};
        List<Integer> yearList = Arrays.stream(years).boxed().collect(Collectors.toList());

        yearList.forEach(year -> {
            System.out.println(isLeapYear(year));
        });

    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                return !(year % 100 == 0) || (year % 100 == 0) && (year % 400 == 0);
            }
        }
        return  false;
    }
}
