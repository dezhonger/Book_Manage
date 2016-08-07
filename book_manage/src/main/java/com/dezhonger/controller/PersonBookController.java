package com.dezhonger.controller;

import com.dezhonger.services.PersonBookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by dezhonger on 2016/8/3.
 */
@Controller
@RequestMapping("/person")
public class PersonBookController {
    @Resource
    PersonBookService personBookService;
    @RequestMapping("/book/{id}")
    public String havebook(@PathVariable String id, Model model) {
        model.addAttribute("result", personBookService.getPersonBookById(id));
        return "havebook";
    }
}
