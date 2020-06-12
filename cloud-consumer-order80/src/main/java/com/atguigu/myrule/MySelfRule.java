package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/5/24 9:19
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //定义为随机访问
        return new RandomRule();
    }

}
