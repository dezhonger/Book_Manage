package com.dezhonger.controller.converter;

/**
 * Created by dezhonger on 2016/8/5.
 */
import org.springframework.core.convert.converter.Converter;

public class IntConverter implements Converter<String, Integer> {

    public Integer convert(String text) {
        if (text == null || "".equals(text)) {
            return 0;
        } else {
            try {
                Integer value = Integer.parseInt(text);
                return value;
            } catch (Exception e) {
                return 0;
            }
        }
    }

}
