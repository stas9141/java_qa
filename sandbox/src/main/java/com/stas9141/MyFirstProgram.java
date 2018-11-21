package com.stas9141;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("hello");

        Point p1 = new Point(2,2);

        Point p2 = new Point(2,2);

        //Point p = new Point();
        double resultReturned = p1.distance(p1,p2); //can be use also from p1 or p2

    }
}