package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/5/24 14:43
 */
@SpringBootApplication
@EnableFeignClients
public class OpenFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignMain.class, args);
    }

}
