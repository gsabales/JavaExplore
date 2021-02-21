package com.javaexplore;

class Operator {
    private double dblVal1 = 20.00d;
    private double dblVal2 = 80.00d;
    private double totalDblVal = 100 * (dblVal1 + dblVal2);
    private double remainder = totalDblVal % 40.00;
    private boolean hasNoRemainder = remainder == 0;

    void printValue() {

        // Sample use of calling method from self-instance
        System.out.println("Class name: " + this.getClass().getSimpleName());

        System.out.println("Total Value: " + totalDblVal);
        System.out.println("Remainder value: " + remainder);
        System.out.println("Has no remainder: " + hasNoRemainder);
        if (!hasNoRemainder)
            System.out.println("Got some remainder");

    }
}

public class OperatorChallenge extends Operator {

    public static void main(String[] args) {
        new Operator().printValue();
    }
}
