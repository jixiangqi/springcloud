package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/5/22 20:41
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8006 {

    public static void main(String[] args) {
        SpringApplication.run(Payment8006.class, args);
    }

}
