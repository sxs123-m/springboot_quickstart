package com.sun;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 孙显圣
 * @version 1.0
 */
@Controller //仍然是spring注解
public class Hi {
    @ResponseBody
    @RequestMapping("/hi")
    public String hello() {
        return "hi, springboot";
    }
}
