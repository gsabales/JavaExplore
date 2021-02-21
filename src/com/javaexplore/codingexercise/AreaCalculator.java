package com.javaexplore.codingexercise;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area (double radius) {
        return (radius >= 0) ? Math.pow(radius, 2) * Math.PI : -1;
    }

    public static double area (double length, double width) {
        return (length >= 0 && width >= 0) ? length * width : -1;
    }
}
