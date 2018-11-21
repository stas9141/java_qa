package com.stas9141;

public class Point {
    public double x;
    public double y;


    //public  Point(){}; //(empty constructor)
   public Point(double x, double y) {
     this.x = x;
     this.y = y;
   }

    public static double distance(Point p1, Point p2)
    {
        double result = Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2));
        System.out.println("distance d between 2 points: "+ "\n"
                + "x1 = " + p1.x +"; y1 = " +p1.y + "; and x2 = "+ p2.x +"; y2 = "+p2.y +";" +" "
                + "\n"+ "d = "+ result);
        return result;
    }

}








