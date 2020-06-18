package com.atguigu.springcloud.alibaba.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/5/31 15:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GatWayConfigTest {

    @Test
    public void aa(){
        ZonedDateTime zbj = ZonedDateTime.now();
        System.out.println(zbj);
    }

}