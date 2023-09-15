package com.itheimaRESTful58.controller;

import com.itheimaRESTful58.domain.User;
import org.springframework.web.bind.annotation.*;

public class BookController {
    @RequestMapping(value="/users",method =RequestMethod.POST)
    @ResponseBody
    public String save(@RequestBody User user){
        System.out.println("user save..." + user);
        return "{'module':'user save'}";
    }

    @RequestMapping(value="/users",method= RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("user update ..."+ user);
        return "{'module':'user update'}";
    }
    @RequestMapping(value ="/users/{id}",method =RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("user delete ..."+ id);
        return "{'module':'user deleter'}";
    }
    @RequestMapping(value = "/users/{id}",method =RequestMethod.DELETE)
    @ResponseBody
    public String save(@PathVariable Integer id){
        System.out.println("user delete ..." + id);
        return "{'module':'user delete'}";
    }
//    @RequestMapping(value = "/users",method =RequestMethod.POST)
//    @ResponseBody
//    public String save(@RequestBody User user){
//        System.out.println("user save ..." + user);
//        return "{'module':'user save'}";
//    }

}
