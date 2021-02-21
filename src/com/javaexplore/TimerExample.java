package com.javaexplore;

import java.time.LocalDateTime;
import java.util.TimerTask;

public class TimerExample extends TimerTask {

    private String name;

    public TimerExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " "
                + name + " has executed successfully at " + LocalDateTime.now());
        if("Task1".equalsIgnoreCase(name)) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
