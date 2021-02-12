package com.titusnachbauer.factors;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FactorsTest {
    @Test
    public void FactorsTest () {
        Factors factors = new Factors();
        Assert.assertEquals(new ArrayList<Integer>(), factors.factor(1));
        Assert.assertEquals(List.of(2), factors.factor(2));
        Assert.assertEquals(List.of(3), factors.factor(3));
        Assert.assertEquals(List.of(2, 2), factors.factor(4));
        Assert.assertEquals(List.of(5), factors.factor(5));
        Assert.assertEquals(List.of(2, 3), factors.factor(6));
        Assert.assertEquals(List.of(7), factors.factor(7));
        Assert.assertEquals(List.of(2, 2, 2), factors.factor(8));
        Assert.assertEquals(List.of(3, 3), factors.factor(9));
        Assert.assertEquals(List.of(2, 5), factors.factor(10));
        Assert.assertEquals(List.of(11), factors.factor(11));
        Assert.assertEquals(List.of(2, 2, 3), factors.factor(12));
        Assert.assertEquals(List.of(13), factors.factor(13));
        Assert.assertEquals(List.of(2, 7), factors.factor(14));
        Assert.assertEquals(List.of(2, 2, 3, 5, 7, 11, 11, 11, 13, 29), factors.factor(2 * 2 * 3 * 5 * 7 * 11 * 11 * 11 * 13 * 29));
    }
}
