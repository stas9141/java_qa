package com.stas9141;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("hello");

        Point p1 = new Point(1,1);

        Point p2 = new Point(1,1);

        System.out.println ("Distance between 2 points =" + Math.sqrt(p1.distance() + p2.distance()));
        //public static double distance(Point p1, Point p2){
        // return  Math.sqrt(p1.x * p2.x + p1.y * p2.y);
       // }
    }
}