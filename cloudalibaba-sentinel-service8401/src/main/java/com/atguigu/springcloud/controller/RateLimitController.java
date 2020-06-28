package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.myhandler.CustomerBlockHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/6/19 18:34
 */
@RestController
@Slf4j
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public String byResource() {
        return "按资源名称限流测试OK";
    }

    public String handleException(BlockException exception) {
        return"服务不可用";
    }


    @GetMapping("/rateLimit/byUrl")
    //@SentinelResource(value = "byUrl")
    public String byUrl() {
        return "按url限流测试OK";
    }


    /**
     * 只能对资源的限流起作用
     * 对url的限制不会走到异常处理
     * 其中blockHandler对应的方法不能为private
     * @return
     */
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException2")
    public String customerBlockHandler() {
        return "访问成功";
    }
}
