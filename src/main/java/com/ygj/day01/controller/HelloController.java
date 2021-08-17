package com.ygj.day01.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-17 15:09
 **/
@Controller
@RequestMapping(value = "/helloController",method = RequestMethod.GET)
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model){
        model.addAttribute("msg","Hello SpringMVC!");
        return "hello";
    }
}
