/**
 *
 */
package com.starcor.calculator.operators;

import com.starcor.calculator.exceptions.InvalidArgumentException;

import java.math.BigDecimal;

/**
 * 抽象操作符类
 */
public abstract class Operator {

    protected BigDecimal[] parseNumbers(String string, String operator) {
        String[] strings = string.split("\\" + operator);
        BigDecimal left = parse(strings[0]);
        BigDecimal right = parse(strings[1]);
        return new BigDecimal[]{left, right};
    }

    /**
     * 抽象计算方法，有具体子类实现
     * @param string 输入表达式
     * @return 计算结果
     */
    public abstract BigDecimal calculate(String string);

    private BigDecimal parse(String string) {
        BigDecimal result;
        try {
            result = new BigDecimal(string);
        } catch (NumberFormatException e) {
            throw new InvalidArgumentException(e.getMessage());
        }
        return result;
    }
}
