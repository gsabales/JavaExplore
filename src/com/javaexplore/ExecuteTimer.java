package com.javaexplore;


import java.util.Timer;

interface Sayable {
    void sayIt(String str1, String str2);
}

public class ExecuteTimer{

    public static void main(String[] args) {
//	    TimerExample te1 = new TimerExample("Task1");
//        TimerExample te2 = new TimerExample("Task2");
//
//        Timer timer = new Timer();
//        timer.scheduleAtFixedRate(te1, 0, 5000);
//        timer.scheduleAtFixedRate(te2, 0, 1000);

//        Long longVar = null;
//        String sample = String.format("%s",longVar,"Hello String");
//        System.out.println(sample);

        Sayable sayable = ExecuteTimer::sayIt;
        sayable.sayIt("Hello", " World!");
    }

    public static void sayIt(String str1, String str2) {
        System.out.println(str1 + str2);
    }

}
