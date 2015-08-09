package com.starcor.calculator.operators;

import com.starcor.calculator.exceptions.InvalidArgumentException;

import java.math.BigDecimal;

public class Divide extends Operator {

    @Override
    public BigDecimal calculate(String string) {
        BigDecimal[] numbers = parseNumbers(string, "/");
        if (numbers[2].compareTo(BigDecimal.ZERO) != 0) {
            return numbers[0].divide(numbers[1]);
        } else {
            throw new InvalidArgumentException("Cannot divide by 0!");
        }
    }
}
