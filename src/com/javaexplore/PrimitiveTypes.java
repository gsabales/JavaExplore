package com.javaexplore;

public class PrimitiveTypes {

    public static void main(String[] args) {
        byte myByte = 127;
        short myShort = 32000;
        int myInt = 144000;
        long myLong = (500000 + 10 * (myByte + myShort + myInt));
        System.out.println(myLong);

        short shortTotal =  (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println(shortTotal);
        int total = (1000 + 10 * (myByte + myShort + myInt));
        System.out.println("Actual total: " + total);

        char myChar = '\u00A9';
        System.out.println(myChar);

        System.out.println("Byte Max: " + Byte.MAX_VALUE);
        System.out.println("Byte Min: " + Byte.MIN_VALUE);
        System.out.println("Short Max: " + Short.MAX_VALUE);
        System.out.println("Short Min: " + Short.MIN_VALUE);
        System.out.println("Integer Max: " + Integer.MAX_VALUE);
        System.out.println("Integer Min: " + Integer.MIN_VALUE);
        System.out.println("Float Max: " + Float.MAX_VALUE);
        System.out.println("Float Min: " + Float.MIN_VALUE);
        System.out.println("Long Max: " + Long.MIN_VALUE);
        System.out.println("Long Min: " + Long.MIN_VALUE);
        System.out.println("Double Max: " + Double.MAX_VALUE);
        System.out.println("Double Min: " + Double.MIN_VALUE);

    }
}
