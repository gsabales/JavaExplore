package com.javaexplore.codingexercise;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int param1, int param2, int param3) {
        return isTeen(param1) || isTeen(param2) || isTeen(param3);
    }

    public static boolean isTeen(int value) {
        return (value > 12) && (value < 20);
    }
}
