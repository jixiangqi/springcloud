package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/5/10 16:27
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
