package com.dezhonger.controller;

import com.dezhonger.entity.Daohang;
import com.dezhonger.services.DaohangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by zwl on 2016/9/18.
 */
@Controller
@RequestMapping(value = "/daohang")
public class DaohangController {
    @Autowired
    DaohangService daohangService;

    @ResponseBody
    @RequestMapping(value = "getAllJson")
    public List<Daohang> getAllJson() {
        return daohangService.getAllDaohang();
    }

    @RequestMapping(value = "getList")
    public String getList(ModelMap modelMap) {
        modelMap.put("list", daohangService.getAllDaohang());
        return "daohang/daohang";
    }
}
