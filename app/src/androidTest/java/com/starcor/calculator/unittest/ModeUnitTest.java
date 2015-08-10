package com.starcor.calculator.unittest;

import com.starcor.calculator.Calculator;
import com.starcor.calculator.CalculatorTestCase;

/**
 * Created by ZFB on 2015/7/31 0031.
 */
public class ModeUnitTest extends CalculatorTestCase {

    public void testAddOperation() {
        String testString = "100%3";
        String expectedResult = "1";
        assertEquals(expectedResult, Calculator.calculate(testString));
    }
}
