package lvs.android.unittest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorParamTest {

    private double mOperandOne;
    private double mOperandTwo;
    private double mExpectedResult;

    private Calculator mCalculator;

    /* Array of tests */
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {3, 4, 7},
                {4, 3, 7},
                {8, 2, 10},
                {-1, 4, 3},
                {3256, 4, 3260}
        });
    }

    /* Constructor */
    public CalculatorParamTest(double mOperandOne, double mOperandTwo, double
            mExpectedResult) {
        this.mOperandOne = mOperandOne;
        this.mOperandTwo = mOperandTwo;
        this.mExpectedResult = mExpectedResult;
    }

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Test
    public void testAdd_TwoNumbers() {
        double resultAdd = mCalculator.add(mOperandOne, mOperandTwo);
        assertEquals(resultAdd, mExpectedResult,0);
    }

}