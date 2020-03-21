package com.sentinel.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/21 18:59
 */
public class ZrsBlockHandler {


    public static String handler1Exception(BlockException exception){

        return  "ZrsBlockHandler invoke handler【1】Exception";
    }

    public static String handler2Exception(BlockException exception){

        return  "ZrsBlockHandler invoke handler【2】Exception";
    }

}
