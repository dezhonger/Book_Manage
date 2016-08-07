package com.dezhonger.exception;

/**
 * Created by dezhonger on 2016/8/5.
 */

public class ParameterException extends Exception {
    String code;

    public ParameterException(String message, String code) {
        super(message);
        this.code = code;
    }
}
