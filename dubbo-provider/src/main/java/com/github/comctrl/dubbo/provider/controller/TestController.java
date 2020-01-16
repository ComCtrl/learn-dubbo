package com.github.comctrl.dubbo.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘彦硕
 * @Description TODO
 * @Date 2019/12/25 4:36 下午
 */
@RestController
public class TestController {
    @GetMapping("test")
    public String test(){
        return "test";
    }
}
