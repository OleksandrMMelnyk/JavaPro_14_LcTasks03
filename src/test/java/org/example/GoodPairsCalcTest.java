package org.example;

import org.junit.Assert;
import org.junit.Test;

public class GoodPairsCalcTest {
    GoodPairsCalc pairsCalc = new GoodPairsCalc();

    @Test
    public void numIdenticalPairsTest() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expected = 4;
        int result = pairsCalc.numIdenticalPairs(nums);
        Assert.assertEquals(expected, result);
    }
}
