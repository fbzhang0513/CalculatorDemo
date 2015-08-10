package com.starcor.calculator.unittest;

import com.starcor.calculator.Calculator;
import com.starcor.calculator.CalculatorTestCase;

/**
 * Created by ZFB on 2015/7/31 0031.
 */
public class MultiplyUnitTest extends CalculatorTestCase {

    public void testAddOperation() {
        String testString = "110*120";
        String expectedResult = "13200";
        assertEquals(expectedResult, Calculator.calculate(testString));
    }
}
