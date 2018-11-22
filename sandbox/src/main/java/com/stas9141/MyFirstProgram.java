package com.stas9141;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("hello");

        Point p1 = new Point(2,2);

        Point p2 = new Point(2,2);

        System.out.println("distance d between 2 points: "+ "\n"
                + "x1 = " + p1.x +"; y1 = " +p1.y + "; and x2 = "+ p2.x +"; y2 = "+p2.y +";" +" "
                + "\n"+ "d = "+ p1.distance(p2));
    }
}