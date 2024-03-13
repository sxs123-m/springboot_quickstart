package com.sun.springboot.config1;

import com.sun.springboot.bean.Furn;
import com.sun.springboot.bean.Monster;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author 孙显圣
 * @version 1.0
 */

/**
 * 这个proxyBeanMethods生效的前提是先通过ioc.getBean来获取BeanConfig这个组件，然后再调用方法
 * 1.Full模式：如果设置为true，默认也是true则返回的是BeanConfig的代理对象，
 * 使用这个代理对象来调用@Bean的方法会使其返回的是单例的对象
 * 2.Lite模式：如果设置为false，则返回的就是普通的BeanConfig对象，调用@Bean的方法返回的就是多例的对象
 * 3.使用说明：组件依赖则必须使用Full模式，如果不需要组件依赖则使用Lite模式，速度快
 */
@Configuration(proxyBeanMethods = false) //这个注解类似于原来的配置文件
@EnableConfigurationProperties({Furn.class}) //启用配置参数
public class BeanConfig {
    /**
     * 类型：Monster
     * id：monster01, 如果想要指定id，只需设置@Bean的name属性
     * 单例bean注入容器：return new Monster()
     * @return
     */
    @Bean
//    @Scope("prototype") //默认是单例的如果希望是多例的，则加一个注解即可。
    public Monster monster01() {
        return new Monster(1, "牛魔王", 12, "牛牛冲撞");
    }

}
