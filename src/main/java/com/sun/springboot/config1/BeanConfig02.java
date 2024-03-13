package com.sun.springboot.config1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 孙显圣
 * @version 1.0
 */
@Configuration
//通过类路径来读取beans.xml文件，引入bean到这个配置类，然后就可以通过SpringBoot的ioc来获取bean
//注意这个注解的属性可以是value也可以是locations，而value属性是可以不写属性名的
@ImportResource(locations = "classpath:beans.xml")
public class BeanConfig02 {

}
