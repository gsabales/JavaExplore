package com.javaexplore.control_flow_challenges;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(32423));
        System.out.println(isPalindrome(32432));
        System.out.println(isPalindrome(-222));
        System.out.println(isPalindrome(-12321));
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;
        int lastDigit;

        // For negative numbers
        number = (number < 0) ? Math.abs(number) : number;

        while (number > 0) {
            // Extract last digit by performing modulo division
            lastDigit = number % 10;
            // Increase place value by multiplying reverse variable by 10 then add last digit
            reverse = reverse * 10 + lastDigit;
            // Once last digit is processed, remove last digit by dividing number by 10, then loop again
            number /= 10;
        }

        // For negative numbers
        reverse = (original < 0 ) ? (0 - reverse) : reverse;

        return original == reverse;
    }
}
