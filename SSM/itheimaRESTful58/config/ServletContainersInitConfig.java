package com.itheimaRESTful58.config;

import com.itheimaRESTful58.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
    //乱码处理
    @Override
    protected javax.servlet.Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new javax.servlet.Filter[0];
    }
    @RequestMapping("/commoParam")
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("普通参数传递 name ==> " + name );
        System.out.println("普通参数 age ==> " + age);
        return "{'module':'common param'}";
    }
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String userName , int age){
        System.out.println("普通参数 userName ==>" + userName);
        System.out.println("普通参数 userName ==>" + age);
        return "{'module':'common param different name'}";
    }
    //嵌套pojo参数
    @RequestMapping("/saveObj")
    @ResponseBody
    public String saveObj(User user){
        System.out.println("对象接收数据"+user);
        return "{'module':'pojo contain pojo param'}";
    }


}
