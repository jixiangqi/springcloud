package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/5/10 16:15
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment8003 {

    public static void main(String[] args) {
        SpringApplication.run(Payment8003.class, args);
    }
}
