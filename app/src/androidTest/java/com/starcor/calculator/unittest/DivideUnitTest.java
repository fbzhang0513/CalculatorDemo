package com.starcor.calculator.unittest;

import com.starcor.calculator.Calculator;
import com.starcor.calculator.CalculatorTestCase;

/**
 * Created by ZFB on 2015/7/31 0031.
 */
public class DivideUnitTest extends CalculatorTestCase {

    public void testAddOperation() {
        String testString = "10/3";
        String expectedResult = "3.33";
        assertEquals(expectedResult, Calculator.calculate(testString));
    }
}
