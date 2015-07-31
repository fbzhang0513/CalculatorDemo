package com.starcor.calculator.operators;

import java.math.BigDecimal;

public class Multiply extends Operator {

    @Override
    public BigDecimal calculate(String string) {
        BigDecimal[] numbers = parseNumbers(string, "*");
        return numbers[0].multiply(numbers[1]);
    }
}
