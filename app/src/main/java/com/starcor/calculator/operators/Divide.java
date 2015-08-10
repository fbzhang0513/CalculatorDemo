package com.starcor.calculator.operators;

import com.starcor.calculator.exceptions.InvalidArgumentException;

import java.math.BigDecimal;

public class Divide extends Operator {

    /**
     * 精确到小数点后几位
     */
    private static final int PRECISION_COUNT = 2;

    @Override
    public BigDecimal calculate(String string) {
        BigDecimal[] numbers = parseNumbers(string, "/");
        if (numbers[1].compareTo(BigDecimal.ZERO) != 0) {
            // 四舍五入
            return numbers[0].divide(numbers[1], PRECISION_COUNT, BigDecimal.ROUND_HALF_UP);
        } else {
            throw new InvalidArgumentException("Cannot divide by 0!");
        }
    }
}
