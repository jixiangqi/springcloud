package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.service.PaymentHystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/5/24 16:31
 */
@RestController
public class PaymentController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    String paymentINfo_OK(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentINfo_OK(id);
    }

    @GetMapping(value = "/consumer/payment/hystrix/timeout/{id}")
    public String paymentINfo_timeout(@PathVariable("id") Integer id){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return paymentHystrixService.paymentINfo_timeout(id);
    }

    public String paymentInfo_TimeoutHandler(Integer id){
        return "消费端出错";
    }
}
