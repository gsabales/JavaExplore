package com.javaexplore.codingexercise;

public class GetThreePrimes {

    public static void main(String[] args) {
        displayThreePrimesFromRange(3, 10);
        displayThreePrimesFromRange(10, 50);
        displayThreePrimesFromRange(18, 30);
    }

    public static void displayThreePrimesFromRange(int min, int max) {
        int ctr = 0;

        System.out.print(String.format("\nFirst three prime numbers from %d to %d: ", min, max));
        for (int counter = min; counter < max; counter++) {
            if (ctr == 3) { break; }
            if (isPrime(counter)) {
                System.out.print(counter + " ");
                ctr++;
            }
        }
    }

    public static boolean isPrime(int number) {

        if (number == 1) {
            return false;
        }

        for (int counter = 2; counter <= number/2; counter++) {
            if (number % counter == 0) {
                return false;
            }
        }

        return true;
    }
}
