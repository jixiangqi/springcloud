package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/5/10 16:41
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
