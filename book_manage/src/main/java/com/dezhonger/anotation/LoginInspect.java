package com.dezhonger.anotation;

import java.lang.annotation.*;

/**
 * Created by Dezhonger on 2017/2/12.
 */
@Target({ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginInspect {
    boolean isTempUserGet() default false;//是否允许临时登录用户查看
}
