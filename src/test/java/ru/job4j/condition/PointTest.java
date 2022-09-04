package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when10To20Then1() {
        double expected = 1;
        Point a = new Point(1, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when02To05Then3() {
        double expected = 3;
        Point a = new Point(0, 2);
        Point b = new Point(0, 5);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}