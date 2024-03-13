package com.sun.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 孙显圣
 * @version 1.0
 */
@Controller //仍然是spring注解
public class HelloController {

    @Value("${my.name}") //在进行依赖注入的时候读取配置文件并将值填充到属性中
    private String name;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        System.out.println(name);
        return "hello, springboot";
    }
}
