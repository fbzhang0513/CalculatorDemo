/**
 *
 */
package com.starcor.calculator.exceptions;

/**
 * 无效参数异常类
 */
public class InvalidArgumentException extends RuntimeException {
    public InvalidArgumentException(String message) {
        super(message);
    }
}
