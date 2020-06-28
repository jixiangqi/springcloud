package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/5/26 21:34
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentINfo_OK(Integer id) {
        return "----------PaymentFallbackService ----> paymentINfo_OK";
    }

    @Override
    public String paymentINfo_timeout(Integer id) {
        return "----------PaymentFallbackService ----> paymentINfo_timeout";
    }
}
