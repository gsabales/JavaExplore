package com.javaexplore.oop2.encapsulation;

class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel,  boolean isDuplex) {
        validateTonerLevel(tonerLevel);
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    private void validateTonerLevel(int tonerLevel) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("Invalid value");
        }
    }

    public int addToner(int tonerAmount) {
        int totalTonerLevel = tonerLevel + tonerAmount;
        if (tonerAmount > 0 && tonerAmount <= 100) {
            return tonerLevel = (totalTonerLevel > 100) ? -1 : totalTonerLevel;
        }

        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}

public class PrinterMain {

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "  +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "  +printer.getPagesPrinted());
    }
}
