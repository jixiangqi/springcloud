package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/5/19 21:14
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "payment/zk")
    public String paymentzk(){
        return "springcloud with zookeeper: "+serverPort+"\t" + UUID.randomUUID().toString();
    }

}
