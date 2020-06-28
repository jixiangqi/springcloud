package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author jixiangqi
 * @version 1.0
 * @date 2020/6/19 18:49
 * sentinel统一处理逻辑类似于异常处理类
 */
public class CustomerBlockHandler {

    public static String handlerException(BlockException exception) {
        return "按客戶自定义,global handlerException----1";
    }

    public static String handlerException2(BlockException exception) {
        return "handlerException2访问失败";
    }

}
