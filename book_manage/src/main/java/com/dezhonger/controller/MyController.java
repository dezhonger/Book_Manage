package com.dezhonger.controller;

import com.dezhonger.entity.Book;
import com.dezhonger.services.BookService;
import com.dezhonger.services.PersonBookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by dezhonger on 2016/8/2.
 */
@Controller
@RequestMapping("/book")
public class MyController {
    @Resource
    BookService bookService;

    @Resource
    PersonBookService personBookService;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("result", bookService.getAllBooks());
        model.addAttribute("sum", bookService.getCountBooks());
        return "list";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id,  RedirectAttributes redirectAttributes) {
        int ans = bookService.delete(id);
        System.out.println(ans);
        if(ans > 0) {
            redirectAttributes.addFlashAttribute("message", "删除成功！");
        }else{
            redirectAttributes.addFlashAttribute("message", "删除失败！");
        }
        return "redirect:/book/list";
    }

    @RequestMapping("/add")
    public String add(ModelMap m, HttpServletRequest httpre) {
        m.put("bookName", httpre.getParameter("bookName"));
        m.put("bookPrice", httpre.getParameter("bookPrice"));
        m.put("bookInfo", httpre.getParameter("bookInfo"));
        return "add";
    }
    @RequestMapping("/addBook")
    public String addBook(@Valid Book book, BindingResult result, RedirectAttributes attr) {
        if(result.hasErrors()) {
            attr.addAttribute("bookName", book.getName());
            attr.addAttribute("bookPrice", book.getPrice());
            attr.addAttribute("bookInfo", book.getInfo());
            System.out.println("id不能为空");
            return "redirect:/book/add";
        }
        else {
            bookService.insert(book);
            return "redirect:/book/list";
        }
    }
    @RequestMapping("/buy/{bookname}")
    public String buyBook(@PathVariable String bookname, HttpSession httpSession) {
        String username = (String) httpSession.getAttribute("username");
        System.out.println(username + "   " + bookname);
        if(username != null && bookname != null) personBookService.insertPersonBook(username,  bookname);
        else return "redirect:/user/error?message=please login in!";
        String url = "redirect:/person/book/" + username;
        return url;
    }

    @RequestMapping("/deletemy/{id}")
    public String deletemy(@PathVariable int id, HttpSession httpSession) {
        String username = (String) httpSession.getAttribute("username");
        System.out.println("id = " + id + " username = " +  username);
        personBookService.delete(id);
        String url = "redirect:/person/book/" + username;
        return url;
    }




}
