package com.starcor.calculator.operators;

import java.math.BigDecimal;

public class Add extends Operator {

    @Override
    public BigDecimal calculate(String string) {
        BigDecimal[] numbers = parseNumbers(string, "+");
        return numbers[0].add(numbers[1]);
    }
}
