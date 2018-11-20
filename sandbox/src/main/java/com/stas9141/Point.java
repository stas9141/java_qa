package com.stas9141;

public class Point {
    public int x;
    public int y;



   public Point(int x, int y) {
     this.x = x;
     this.y = y;
   }

    public double distance() {
      return Math.sqrt((x-x)*x + (y-y)*y);
   }

}








