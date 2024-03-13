package com.sun.springboot;

import com.sun.springboot.bean.Cat;

import com.sun.springboot.bean.Furn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 孙显圣
 * @version 1.0
 */
//表示是一个springboot项目
@SpringBootApplication(scanBasePackages = {"com.sun"}) //扫描指定的包，参数是数组类型的
public class MainApp {
    public static void main(String[] args) {
        //启动springboot
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApp.class, args);

        //测试配置绑定
        Furn bean = ioc.getBean(Furn.class);
        System.out.println(bean);

    }
}
