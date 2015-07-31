/**
 *
 */
package com.starcor.calculator.operators;

import com.starcor.calculator.exceptions.InvalidArgumentException;

/**
 * 操作符工厂类
 */
public class OperatorFactory {

    /**
     * 根据输入表达式生成对应的操作符类
     * @param validString 输入表达式
     * @return 对应的操作符类
     */
    public static Operator createOperator(String validString) {
        Operator operator;
        if (validString.contains("+")) {
            operator = new Add();
        } else if (validString.contains("-")) {
            operator = new Minus();
        } else if (validString.contains("*")) {
            operator = new Multiply();
        } else if (validString.contains("/")) {
            operator = new Divide();
        } else if (validString.contains("%")) {
            operator = new Mode();
        } else {
            throw new InvalidArgumentException("Invalid Operation!");
        }
        return operator;
    }
}
