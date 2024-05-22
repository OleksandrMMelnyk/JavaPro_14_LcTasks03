package org.example;

import org.junit.Assert;
import org.junit.Test;

public class BalloonsCalcTest {
    BalloonsCalc balloonsCalc = new BalloonsCalc();

    @Test
    public void maxNumberOfBalloonsTest() {
        String text = "loonbalxballpoon";
        int expected = 2;
        int result = balloonsCalc.maxNumberOfBalloons(text);
        Assert.assertEquals(expected, result);
    }
}
