package com.mettre.wechatcommon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class WechatCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatCommonApplication.class, args);
    }

}
