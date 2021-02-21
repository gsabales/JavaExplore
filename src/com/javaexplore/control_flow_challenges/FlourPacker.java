package com.javaexplore.control_flow_challenges;

public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(1, 0, 6));
    }

    /**
     * bigCount = 5 kgs of flour, smallCount = 1kg of flour, goal = total kgs of flour allowed
     * If sum of kgs is greater than goal, ensure that only full bags are used towards goal amount.
     * No negative numbers and sum must be at least equal to goal.
     * If bigCount is not zero, check if goal is greater than or equal bigCount.
     * If it is, get the remaining kilos. If not, get remainder by 5.
     */
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        int totalKilos, remainingKilos = 0;
        bigCount *= 5;

        totalKilos = bigCount + smallCount;

        try {
            if ((bigCount >= 0 && smallCount >= 0 && goal >= 0) && (totalKilos >= goal)) {
                if (bigCount != 0) {
                    remainingKilos = (goal >= bigCount) ? goal % bigCount : goal % 5;
                }
                return smallCount >= remainingKilos;
            }
        } catch (ArithmeticException e) {
            System.out.println("\nRuntime error: " + e.getMessage());
        }

        return false;
    }

    // Tim's solution
    public static boolean canPackYou(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if(goal > ((bigCount * 5) + smallCount)) {
            return false;
        }

        if((goal % 5) > smallCount) {
            return false;
        }
        return true;
    }
}
