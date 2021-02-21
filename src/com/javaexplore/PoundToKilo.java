package com.javaexplore;

import java.util.Scanner;

interface Convertible {
    double UNIT = 0.45359237;
    static double poundToKilo(double pound) { return pound * UNIT; }
}

public class PoundToKilo implements Convertible{

    public static void main(String[] args) {
        double pound;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value (lbs): ");
        pound = scanner.nextInt();
        System.out.println(pound + " lbs is equal to " + Convertible.poundToKilo(pound) + " kg");

    }
}
