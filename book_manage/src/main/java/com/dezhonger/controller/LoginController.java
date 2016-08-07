package com.dezhonger.controller;

import com.dezhonger.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by dezhonger on 2016/8/2.
 */
@Controller
@RequestMapping(value = "/user")
public class LoginController {
    @Resource
    private UserService userService;

//    @RequestMapping(value = "/login")
//    public String login(String a, String b, HttpSession httpSession, RedirectAttributes redirectAttributes) {
//        boolean can = b.equals(userService.chaxun(a));
//        if(can) {
//            httpSession.setAttribute("user", a + "_" + b);
//            return "redirect:/book/list";
//        }
//        else {
////            redirectAttributes.addFlashAttribute("message", "WRONG PASSWORD");
//            return "redirect:/user/error?message=WRONG PASSWORD";
//        }
//    }
    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession, RedirectAttributes redirectAttributes) {
        String username = request.getParameter("name");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        boolean can = password.equals(userService.chaxun(username));
        if(can) {
            httpSession.setAttribute("user", username + "_" + password);
            httpSession.setAttribute("username", username);
            return "redirect:/book/list";
        }
        else {
//            redirectAttributes.addFlashAttribute("message", "WRONG PASSWORD");
            return "redirect:/user/error?message=WRONG PASSWORD";
        }
    }
    @RequestMapping(value = "/logout")
    public String logout() {
        return "index";
    }
    @RequestMapping(value = "/error")
    public String error(String message, Model m) {
        m.addAttribute("message", message);
        return "error";
    }
}
