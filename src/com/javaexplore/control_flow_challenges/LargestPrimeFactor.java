package com.javaexplore.control_flow_challenges;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        System.out.println(getLargestPrimeFactor(21));
        System.out.println(getLargestPrimeFactor(217));
        System.out.println(getLargestPrimeFactor(0));
        System.out.println(getLargestPrimeFactor(45));
        System.out.println(getLargestPrimeFactor(-1));

    }

    // One-method solution
    public static int getLargestPrimeFactor(int number) {
        int result = number;
        boolean isPrime;

        if (number > 1) {
            for (int counter = number - 1; counter >= 2; counter--) {
                // Set to default value every loop
                isPrime = true;

                // If one of the number's factors...
                if (number % counter == 0) {
                    // ...verify if prime number or not
                    for (int i = 2; i <= counter/2; i++) {
                        if (counter % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    // If factor is prime number, return result
                    if (isPrime) {
                        result = counter;
                        break;
                    }
                }
            }
            return result;
        }
        return -1;
    }

    public static boolean isPrime(int param) {

        if (param == 1) {
            return false;
        }

        for (int ctr = 2; ctr <= param/2; ctr++) {
            if (param % ctr == 0) {
                return false;
            }
        }

        return true;
    }

}
