package com.hzit.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2018/6/29 0029.
 */
@SpringBootApplication
@EnableEurekaServer
public class StartEureKaCenter {

    public static void main(String[] args) {
        SpringApplication.run(StartEureKaCenter.class,args);
    }
}
