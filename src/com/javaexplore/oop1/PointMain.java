package com.javaexplore.oop1;

class Point {
    private int x;
    private int y;

    public Point() { this(0, 0); }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2.0) + Math.pow(this.y, 2.0));
    }

    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }

    public double distance(int x, int y) {
        int pointA = this.x - x;
        int pointB= this.y - y;

        return Math.sqrt(Math.pow(pointA, 2.0) + Math.pow(pointB, 2.0));
    }
}

public class PointMain {

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        Point point = new Point();
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2,2));
        System.out.println("distance()= " + point.distance());

    }
}
