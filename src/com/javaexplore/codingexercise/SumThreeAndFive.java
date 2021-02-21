package com.javaexplore.codingexercise;

public class SumThreeAndFive {
    public static void main(String[] args) {
        int min = 1;
        int max = 1000;
        int sum = 0;
        int breakCtr = 1;

        System.out.print(String.format("First five numbers from %d to %d divisible by 3 or 5: ", min, max));
        for (int ctr = min; ctr <= max; ctr++) {
            if (ctr % 3 == 0 && ctr % 5 == 0) {
                sum += ctr;
                System.out.print(ctr + " ");
                if (breakCtr == 5) break;
                breakCtr++;
            }
        }
        System.out.println("\nSum of these numbers: " + sum);
    }
}
