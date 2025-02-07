package com.csc205.project1;

public class Point {

    private double x, y;

    public Point() {
    }

    public Point(double a, double b) {

        x = a;
        y = b;

    }

    public double distance(Point p2) {

        return Math.sqrt(Math.pow(p2.getX() - x, 2) + Math.pow(p2.getY() - y, 2));

    }

    public double getX() {

        return x;

    }

    public double getY() {

        return y;

    }

    public void setX(double a) {

        x = a;

    }

    public void setY(double b) {

        y = b;

    }

    public void setPoint(double a, double b) {

        x = a;
        y = b;

    }

    public void shiftX(double n) {

        x = x + n;

    }

    public void shiftY(double n) {

        y = y + n;

    }

    public void rotate(double angle) {

        double temporaryX = x;

        x = x * Math.cos(angle) - y * Math.sin(angle);
        y = temporaryX * Math.sin(angle) + y * Math.cos(angle);

    }

    public String toString() {

        return "(" + x + ", " + y + ")";

    }

}