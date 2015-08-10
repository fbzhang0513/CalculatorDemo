package com.starcor.calculator.functiontest;

import com.starcor.calculator.Calculator;
import com.starcor.calculator.CalculatorTestCase;
import com.starcor.calculator.exceptions.InvalidArgumentException;

/**
 * Created by ZFB on 2015/8/10 0010.
 */
public class FunctionTest extends CalculatorTestCase {

    public void testShouldTrimEmptySpace() {
        String result = Calculator.calculate(" 3 + 2 ");
        assertEquals("5", result);
    }

    public void testShouldThrowInvalidArgumentException() {
        boolean isThrowed = false;
        try {
            Calculator.calculate("ABC");
        } catch (InvalidArgumentException e) {
            isThrowed = true;
        }

        assertTrue(isThrowed);
    }
}
