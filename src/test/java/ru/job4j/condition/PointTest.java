package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when000To002Then2() {
        double expected = 2;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 2);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when020To022Then2() {
        double expected = 2;
        Point a = new Point(0, 2, 0);
        Point b = new Point(0, 2, 2);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when020To142Then3() {
        double expected = 3;
        Point a = new Point(0, 2, 0);
        Point b = new Point(1, 4, 2);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}