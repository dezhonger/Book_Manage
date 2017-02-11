package com.dezhonger.controller.api;

import com.dezhonger.result.ResponseResult;
import com.dezhonger.result.Test1Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Dezhonger on 2017/2/12.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @ResponseBody
    @RequestMapping(value = {"/test", "/"})
    public ResponseResult<Test1Result> index() {
        ResponseResult<Test1Result> returnResult = new ResponseResult<Test1Result>();
        Test1Result test1Result = new Test1Result();
        test1Result.setName("dezhonger");
        test1Result.setAge(25);
        test1Result.setDate(new Date());
        test1Result.setCreateTime(new Date());
        test1Result.setUpdateTime(new Date());
        returnResult.setDate(test1Result);
        return returnResult;
    }
}
