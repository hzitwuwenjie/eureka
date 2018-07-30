package com.hzit.eureka.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2018/6/29 0029.
 */
@SpringBootApplication
@EnableEurekaClient
public class StartWebApp {
    public static void main(String[] args)
    {
        SpringApplication.run(StartWebApp.class,args);
    }
}
