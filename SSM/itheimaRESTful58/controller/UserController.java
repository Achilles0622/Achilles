package com.itheimaRESTful58.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController{
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module':'user save'}";
    }
    @RequestMapping("/save")
    @ResponseBody
    public String delete(){
        System.out.println("user delete ...");
        return "{'module':'user delete'}";
    }
    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")Date date2){
        System.out.println("参数传递 date ==>" + date);
        System.out.println("参数传递 date(yyyy-MM-dd) ==>" + date1);
        System.out.println("参数传递 date(yyyy/MM/dd HH:mm:ss) ==>" + date2);
        return  "{'module':'data param'}";
    }

}
