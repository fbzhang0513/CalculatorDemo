package com.starcor.calculator.unittest;

import com.starcor.calculator.Calculator;
import com.starcor.calculator.CalculatorTestCase;

/**
 * Created by ZFB on 2015/7/31 0031.
 */
public class AddUnitTest extends CalculatorTestCase {

    public void testAddOperation() {
        String testString = "2222222222+5555555555";
        String expectedResult = "7777777777";
        assertEquals(expectedResult, Calculator.calculate(testString));
    }
}
