package com.sun.springboot.config1;

import com.sun.springboot.bean.Cat;
import com.sun.springboot.bean.Dog;
import com.sun.springboot.bean.Monster;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 孙显圣
 * @version 1.0
 */

//这是第二个bean配置文件
@Configuration
@Import({Cat.class, Dog.class}) //将Dog和Cat类注入容器，id为全类名
public class BeanConfig01 {
    public Monster monster02() {
        return new Monster(1, "牛魔王", 12, "牛牛冲撞");
    }
}
