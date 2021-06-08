package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testDistance () {
        Point start = new Point (1,3);
        Point end = new Point(1,4);
        Assert.assertEquals(start.distance(end) , 1);

    }
    @Test
    public void testDistance1 () {
        Point start = new Point (1,4);
        Point end = new Point(1,3);
        Assert.assertEquals(start.distance(end) , 1);

    }
    @Test
    public void testDistance2 () {
        Point start = new Point (1,3);
        Point end = new Point(1,-1);
        Assert.assertEquals(start.distance(end) , 4);

    }
}


