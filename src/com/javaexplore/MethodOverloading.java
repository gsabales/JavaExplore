package com.javaexplore;

public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("Glenn", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimeters(8, 4);
        calcFeetAndInchesToCentimeters(10);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("No player name, no player score");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        // 1 foot = 12 inches, 1 inch = 2.54cm
        double centimeters = (feet * 12 + inches) * 2.54;
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            System.out.println(String.format("%.2f feet, %.2f inches = %.2f cm", feet, inches, centimeters));
            return centimeters;
        }

        System.out.println("Invalid parameters");
        return  -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        return (inches >= 0) ? calcFeetAndInchesToCentimeters((int)(inches / 12), inches % 12) : -1;
    }
}
