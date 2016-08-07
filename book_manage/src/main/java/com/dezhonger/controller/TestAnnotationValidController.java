package com.dezhonger.controller;

import com.dezhonger.entity.User4;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by dezhonger on 2016/8/5.
 */
@Controller
@RequestMapping(value="av")
public class TestAnnotationValidController {

    @RequestMapping
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("/TestAnnotationValid/user4", "user4", new User4());
        return view;
    }

    @RequestMapping(value="/add", method= RequestMethod.POST)
    public ModelAndView add(@ModelAttribute @Valid User4 user, BindingResult result) {
        ModelAndView view = new ModelAndView("/TestAnnotationValid/index");
        view.addObject("user4", user);
//
//        if(result.hasErrors()) {
//            List<FieldError> errors = result.getFieldErrors();
//            for(FieldError err : errors) {
//                System.out.println("ObjectName:" + err.getObjectName() + "\tFieldName:" + err.getField()
//                        + "\tFieldValue:" + err.getRejectedValue() + "\tMessage:" + err.getDefaultMessage() + "\tCode:");
//            }
//        }

        return view;
    }

}
