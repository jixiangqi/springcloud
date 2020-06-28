package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/5/19 21:49
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain10 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain10.class, args);
    }
}
