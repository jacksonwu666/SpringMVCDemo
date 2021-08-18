package com.ygj.day01.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version 1.0
 * @description: Json格式化工具类
 * @author: WuXiang
 * @create: 2021-08-18 15:11
 **/
public class JsonUtils {

    public static String getJson(Object object){
        return getJson(object,"yyyy-MM-dd HH:mm:ss");
    }

    public static String getJson(Object object,String dateFormate){
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormate);
        //不使用时间差方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //指定日期格式
        mapper.setDateFormat(sdf);
        if (!(object instanceof Date)){
            return "日期对象有误，无法格式化！";
        }
        try {
        return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }


}
