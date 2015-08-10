package com.starcor.calculator.performancetest;

import android.test.suitebuilder.annotation.SmallTest;

import com.starcor.calculator.Calculator;
import com.starcor.calculator.CalculatorTestCase;

/**
 * Created by ZFB on 2015/8/10 0010.
 */
public class PerformanceTest extends CalculatorTestCase {
    private static final int TEST_COUNT = 10000;

    @SmallTest
    public void testPerformance() {
        for (int i = 0; i < TEST_COUNT; i++) {
            Calculator.calculate("3+2");
        }
    }

}
