package com.atguigu.springcloud.alibaba.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/5/24 9:49
 */
public interface LoadBalancer {


    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
