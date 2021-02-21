package com.javaexplore.codingexercise;

public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        printConversion(0.0);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour >= 0) {
            double milesPerHour = kilometersPerHour / 1.609;
            return Math.round(milesPerHour);
        }

        return -1;
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour >= 0) {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            System.out.printf("%s km/h = %d mi/h\n", kilometersPerHour, milesPerHour);
        } else
            System.out.println("Invalid Value\n");
    }
}
