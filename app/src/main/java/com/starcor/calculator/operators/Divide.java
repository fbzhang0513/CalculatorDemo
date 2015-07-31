package com.starcor.calculator.operators;

import java.math.BigDecimal;

public class Divide extends Operator {

    @Override
    public BigDecimal calculate(String string) {
        BigDecimal[] numbers = parseNumbers(string, "/");
        return numbers[0].divide(numbers[1]);
    }
}
