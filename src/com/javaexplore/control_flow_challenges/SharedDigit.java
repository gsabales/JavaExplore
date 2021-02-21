package com.javaexplore.control_flow_challenges;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        int firstNumberLastDigit = firstNumber % 10;
        int secondNumberLastDigit = secondNumber % 10;

        if ((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)) {
            int firstNumberFirstDigit = firstNumber / 10;
            int secondNumberFirstDigit = secondNumber / 10;
            return (firstNumberFirstDigit == secondNumberFirstDigit) || (firstNumberFirstDigit == secondNumberLastDigit) ||
                   (firstNumberLastDigit == secondNumberFirstDigit) || (firstNumberLastDigit == secondNumberLastDigit);
        }

        return false;
    }
}
