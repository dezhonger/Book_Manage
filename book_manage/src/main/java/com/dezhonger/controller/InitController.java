package com.dezhonger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dezhonger on 2016/8/3.
 */
@Controller
public class InitController {
    @RequestMapping(value = {"/login", "/"})
    public String index() {
        return "index";
    }
}
