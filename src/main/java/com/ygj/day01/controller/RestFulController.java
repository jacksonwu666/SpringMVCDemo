package com.ygj.day01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-17 17:03
 **/
@Controller
public class RestFulController {

    @RequestMapping("/t1/{a}/{b}")
    public String testRestful(@PathVariable int a,@PathVariable int b , Model model){
        int result = a + b;
        model.addAttribute("msg",result);
        return "hello";
    }

}
