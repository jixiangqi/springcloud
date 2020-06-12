package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/5/24 16:30
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    String paymentINfo_OK(@PathVariable("id") Integer id);


    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    String paymentINfo_timeout(@PathVariable("id") Integer id);
}
