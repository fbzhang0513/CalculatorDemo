package com.starcor.calculator.unittest;

import com.starcor.calculator.Calculator;
import com.starcor.calculator.CalculatorTestCase;

/**
 * Created by ZFB on 2015/7/31 0031.
 */
public class MinusUnitTest extends CalculatorTestCase {

    public void testAddOperation() {
        String testString = "5555555555-2222222222";
        String expectedResult = "3333333333";
        assertEquals(expectedResult, Calculator.calculate(testString));
    }
}
