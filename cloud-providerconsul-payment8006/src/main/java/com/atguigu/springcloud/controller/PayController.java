package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/5/22 20:43
 */
@RestController
public class PayController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "payment/consul")
    public String paymentzk(){
        return "springcloud with consul: "+serverPort+"\t" + UUID.randomUUID().toString();
    }
}
