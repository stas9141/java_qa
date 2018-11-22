package com.stas9141;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTest {

    @Test
    public void testDistance(){
        Point p1 = new Point(1.0,1.0);
        Point p2 = new Point(1.0,1.0);
        Assert.assertEquals(p1.distance(p1,p2),0.0);
        }
        
}
