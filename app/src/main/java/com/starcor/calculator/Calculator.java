/**
 *
 */
package com.starcor.calculator;

import com.starcor.calculator.exceptions.InvalidArgumentException;
import com.starcor.calculator.operators.Operator;
import com.starcor.calculator.operators.OperatorFactory;

/**
 * 计算器类
 */
public class Calculator {

    /**
     * 根据输入表达式计算结果，目前只支持二元操作
     *
     * @param inputString 输入表达式，例如“1*2”、“5/6”等
     * @return 计算结果
     */
    public static String calculate(String inputString) throws InvalidArgumentException {
        String validString = removeSpace(inputString);
        Operator operator = OperatorFactory.createOperator(validString);
        return operator.calculate(validString).toString();
    }

    private static String removeSpace(String inputString) {
        return inputString.replaceAll("\\s", "");
    }
}
