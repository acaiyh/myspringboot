package com.innov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController //为开发者方便去读代码和为此类付一个特殊的角色
@EnableAutoConfiguration //自动配置
@ComponentScan //开启扫描
@SpringBootApplication
public class MyApplication {

    @RequestMapping("/") //请求
    String test(){
        return "Test successfull" ;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args) ;
    }
}
