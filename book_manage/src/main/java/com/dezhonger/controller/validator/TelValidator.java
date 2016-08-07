package com.dezhonger.controller.validator;

/**
 * Created by dezhonger on 2016/8/5.
 */
import javax.annotation.Resource;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.context.support.ResourceBundleMessageSource;

public class TelValidator implements ConstraintValidator<Tel, String> {

    @Resource
    private ResourceBundleMessageSource messageSource;

    private Tel tel;

    public void initialize(Tel tel) {
        this.tel = tel;
    }

    public boolean isValid(String value, ConstraintValidatorContext constraintContext) {
        boolean isValid;

        if(value != null && value.length() >= tel.min()) {
            isValid = true;
        }
        else {
            isValid = false;
        }

        if(!isValid) {
            constraintContext.disableDefaultConstraintViolation();
            constraintContext.buildConstraintViolationWithTemplate(tel.message()).addConstraintViolation();
        }
        return isValid;
    }

}
