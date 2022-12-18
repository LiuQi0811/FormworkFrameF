package com.frame.modules.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 *@ClassName FrameSystemApplication
 *@Description TODO
 *@Author LiuQi
 *@Date 2022/12/17 10:38
 *@Version 1.0
 */
@MapperScan(basePackages = "com.frame.modules.system.mapper")
@SpringBootApplication
public class FrameSystemApplication
{
    public static void main(String[] args) {
        SpringApplication.run(FrameSystemApplication.class,args);
    }
}
