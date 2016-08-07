package com.dezhonger.controller;

import com.dezhonger.exception.BusinessException;
import com.dezhonger.exception.ParameterException;
import com.dezhonger.services.PersonBookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by dezhonger on 2016/8/3.
 */
@Controller
public class TestController {
    @Resource
    PersonBookService personBookService;

    @RequestMapping("/1")
    @ResponseBody
    public String getText() {
        return "text";
    }
    @RequestMapping(value = "/2", method = RequestMethod.POST)
    @ResponseBody
    public String getTextPost() {
        return "text post";
    }
    @RequestMapping(value = "/3", method = RequestMethod.GET)
    @ResponseBody
    public String getTextGet() {
        return "text GET";
    }

    @RequestMapping(value = "/4", headers = "key=val")
    @ResponseBody
    public String getHead() {
        return "getHead";
    }

    @RequestMapping(value = "/5/{id}")
    @ResponseBody
    public String getFoosBySimplePathWithPathVariable(@PathVariable("id") long id) {
        return "Get a specific Foo with id=" + id;
    }
    @RequestMapping(value = "/6/{numericId:[\\d]+}")
    @ResponseBody
    public String getBarsBySimplePathWithPathVariable(@PathVariable final long numericId) {
        return "!Get a specific Bar with id=" + numericId;
    }
    @RequestMapping(value = "/7", params = "id")
    @ResponseBody
    public String getBarBySimplePathWithExplicitRequestParam(@RequestParam("id") long id) {
        return "Get 7 =" + id;
    }
    @RequestMapping(value = "/8", produces="text/html;charset=UTF-8")
    @ResponseBody
    public String getP() {
        return personBookService.getPersonBookById("admin").toString();
    }


    @RequestMapping(value = "/9")
    public String exception() throws Exception {
        throw new BusinessException("50", "controller9");
    }
    @RequestMapping(value = "/10")
    public String exception2() throws Exception {
        throw new ParameterException("50", "controller10");
    }
    @RequestMapping(value = "/11")
    public String exception3() throws Exception {
        throw new Exception("50");
    }
}
