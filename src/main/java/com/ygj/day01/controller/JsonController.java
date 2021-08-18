package com.ygj.day01.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ygj.day01.dto.User;
import com.ygj.day01.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @version 1.0
 * @description: TODO
 * @author: WuXiang
 * @create: 2021-08-18 14:53
 **/
@RestController
@RequestMapping("/json")
public class JsonController {

    @RequestMapping(value = "/json1",produces = "application/json;charset=utf-8")
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user1 = new User("秦疆1号", 3, "男");
        User user2 = new User("秦疆2号", 3, "男");
        User user3 = new User("秦疆3号", 3, "男");
        User user4 = new User("秦疆4号", 3, "男");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return mapper.writeValueAsString(list);
    }

    @RequestMapping("/json2")
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Date now = new Date();
       return mapper.writeValueAsString(now);
    }

    @RequestMapping("/json3")
    public String json3() throws JsonProcessingException {
        Date date = new Date();
        String str = JsonUtils.getJson(date);
        return str;
    }

}
