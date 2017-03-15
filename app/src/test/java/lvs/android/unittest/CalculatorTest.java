package lvs.android.unittest;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/*
Unit test using JUnit
 */
public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Test
    public void calculator_CorrectAdd_ReturnsTrue() {
        double resultAdd = mCalculator.add(3, 4);

        // 7 : expected result
        // resultAdd : method name
        // 0 : delta
        assertEquals("adding 3 + 4 didn't work this time", 7, resultAdd , 0);
    }
}
