package com.javaexplore.codingexercise;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.175, -3.1756);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);
    }

    public static boolean areEqualByThreeDecimalPlaces(double dblValue1, double dblValue2) {
        int value1 = (int) (dblValue1 * 1000);
        int value2 = (int) (dblValue2 * 1000);

        return value1 == value2;
    }

    // Java 8 Solution
//    public static boolean areEqualByThreeDecimalPlaces(double dblValue1, double dblValue2) {
//        BigDecimal bigDecimal1 = roundDown(dblValue1);
//        BigDecimal bigDecimal2 = roundDown(dblValue2);
//
//        System.out.println(bigDecimal1.equals(bigDecimal2));
//        return bigDecimal1.equals(bigDecimal2);
//    }
//
//    public static BigDecimal roundDown(double dblVaue) {
//        BigDecimal bigDecimal = new BigDecimal(Double.toString(dblVaue));
//
//        return bigDecimal.setScale(3, RoundingMode.DOWN);
//    }
}
