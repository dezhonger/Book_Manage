package com.dezhonger.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dezhonger on 2016/8/5.
 */
public class MyExceptionHandler implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("message", ex);

        // 根据不同错误转向不同页面
        if(ex instanceof BusinessException) {
            return new ModelAndView("error-business", model);
        }else if(ex instanceof ParameterException) {
            model.put("cuowuxinxi", ((ParameterException) ex).code);
            return new ModelAndView("error-parameter", model);
        } else {
            return new ModelAndView("error", model);
        }
    }
}
