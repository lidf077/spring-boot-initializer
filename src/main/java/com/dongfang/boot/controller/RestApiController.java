package com.dongfang.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController // 二合一注解
@RequestMapping(path = "/rest")
//@ResponseBody //这个类的所有方法返回的数据直接写给浏览器(如果是对象，转为JSON数据)
public class RestApiController {
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "{\"message\": \"Hello World\"}";
    }
}
