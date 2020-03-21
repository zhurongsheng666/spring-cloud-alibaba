package com.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/21 14:43
 */
@RestController
public class HotkeyController {

    /**
     * SentinelResource: sentinel相关配置，value唯一，blockHandler回调方法
     */
    @GetMapping("/hotkey")
    @SentinelResource(value = "hotkey",blockHandler = "dealHotkey")
    public String hotkey(@RequestParam(value = "key",required = false) String key){
        return "hello hotkey,  O(∩_∩)O";
    }

    public String dealHotkey(String key, BlockException e){
        return "调用失败,   o(╥﹏╥)o";
    }

}
