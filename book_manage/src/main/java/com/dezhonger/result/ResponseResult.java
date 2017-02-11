package com.dezhonger.result;

/**
 * Created by Dezhonger on 2017/2/12.
 */
public class ResponseResult<T> {

    private T date;
    private String code = "0000";
    private String message = "success";

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "date=" + date +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
