package com.javaexplore.codingexercise;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(21);
    }

    public static void printSquareStar(int number) {

        if (number >= 5) {
            // row
            for(int row = 1; row <= number; row++) {
                // column
                for (int column = 1; column <= number; column++) {
                    // Conditions:
                    // 1. In the first or last row
                    // 2. In the first or last column
                    // 3. If row == column
                    // 4. If current column == (total rows - current row) + 1
                    if (row == 1 || column == 1|| row == number || column == number ||
                        row == column || column == (number - row + 1))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

}
