package com.javaexplore.codingexercise;

public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes >= 0) {
            int megabytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.printf("%s KB = %d MB and %d KB\n", kiloBytes, megabytes, remainder);
        } else
            System.out.println("Invalid Value");
    }
}
