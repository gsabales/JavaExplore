package com.javaexplore.codingexercise;

public class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(945));
        System.out.println(getDurationString(65, 9));
    }

    public static String getDurationString(int minutes, int seconds) {
        String output = INVALID_VALUE_MESSAGE;
        int hours = minutes / 60;

        if (minutes >= 0  && seconds >= 0) {
            minutes = minutes < 60 ? minutes : minutes % 60;

            if (seconds >= 60) {
                minutes = minutes + (seconds / 60);
                seconds = seconds % 60;
            }

            output = String.format("%02dh %02dm %02ds", hours, minutes, seconds);
            return output;
        }

        return output;
    }

    public static String getDurationString(int seconds) {
        return seconds >= 0 ? getDurationString(seconds / 60, seconds % 60) : INVALID_VALUE_MESSAGE;
    }
}
