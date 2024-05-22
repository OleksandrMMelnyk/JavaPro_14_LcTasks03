package org.example;

import org.junit.Assert;
import org.junit.Test;

public class JewelsCalcTest {
    JewelsCalc calc = new JewelsCalc();

    @Test
    public void numJewelsInStonesOneLoopTest() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        int actual = calc.numJewelsInStonesOneLoop(jewels, stones);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesCharArraysTest() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        int actual = calc.numJewelsInStonesCharArrays(jewels, stones);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numJewelsInStonesTwoLoopsTest() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        int actual = calc.numJewelsInStonesTwoLoops(jewels, stones);
        Assert.assertEquals(expected, actual);
    }
}
