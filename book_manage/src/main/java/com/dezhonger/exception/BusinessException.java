package com.dezhonger.exception;

/**
 * Created by dezhonger on 2016/8/5.
 */
public class BusinessException extends Exception {
    String code;

    public BusinessException(String message, String code) {
        super(message);
        this.code = code;
    }
}
