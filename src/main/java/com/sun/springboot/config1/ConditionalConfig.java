package com.sun.springboot.config1;

import com.sun.springboot.bean.Cat;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 孙显圣
 * @version 1.0
 */
//测试条件装配

@Configuration
public class ConditionalConfig {
    //这里注入一个猫girl
    @Bean(name = "cat_girl")
    public Cat cat() {
        return new Cat();
    }

    @Bean
    @ConditionalOnBean(name = "cat_girl") //注入一个猫boy,条件是有一个猫girl
    public Cat cat_boy() {
        return new Cat();
    }

    @Bean
    @ConditionalOnMissingBean(name = "cat_girl") //注入一个猫boy,条件是没有一个猫girl
    public Cat cat_boy2() {
        return new Cat();
    }
}
