package com.javaexplore.control_flow_challenges;

public class NumberToWords {

    public static void main(String[] args) {
//        numberToWords(123);
//        numberToWords(1010);
//        numberToWords(1000);
//        numberToWords(-12);
//        numberToWords(9266495);
        numberToWords(0);
    }

    public static void numberToWords(int number) {
        // Number should be reversed since current logic process the number from right to left
        int reversedNumber = reverse(number);
        int lastDigit = reversedNumber % 10;
        int counter = reversedNumber, digit;

        if (number > 0) {
            while (counter != 0) {
                digit = (counter == reversedNumber) ? lastDigit : counter % 10;

                switch (digit) {
                    case 0: System.out.println("Zero"); break;
                    case 1: System.out.println("One"); break;
                    case 2: System.out.println("Two"); break;
                    case 3: System.out.println("Three"); break;
                    case 4: System.out.println("Four"); break;
                    case 5: System.out.println("Five"); break;
                    case 6: System.out.println("Six"); break;
                    case 7: System.out.println("Seven"); break;
                    case 8: System.out.println("Eight"); break;
                    case 9: System.out.println("Nine"); break;
                }

                counter /= 10;
            }

            // If number has trailing zeroes
            int numberDigitCount = getDigitCount(number);
            int reversedNumberDigitCount = getDigitCount(reversedNumber);

            if (numberDigitCount != reversedNumberDigitCount) {
                int countDiff = numberDigitCount - reversedNumberDigitCount;
                for (int i = 0; i < countDiff; i++) {
                    System.out.println("Zero");
                }
            }
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Invalid Value");
        }
    }

    /**
     * From NumberPalindrome code exercise
     */
    public static int reverse(int number) {
        int original = number;
        int reverse = 0;
        int lastDigit;

        number = (number < 0) ? Math.abs(number) : number;

        while (number > 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        reverse = (original < 0 ) ? (0 - reverse) : reverse;

        return reverse;
    }

    public static int getDigitCount(int number) {
        int digitCount = (number == 0) ? 1: 0;

        if (number >= 0) {
            for (int counter = number; counter != 0; counter /= 10) {
                digitCount++;
            }

            return digitCount;
        }

        return -1;
    }
}
