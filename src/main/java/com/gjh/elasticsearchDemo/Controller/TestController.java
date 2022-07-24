package com.gjh.elasticsearchDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {


    @GetMapping(value = "/01")
    public String test01() {
        return "hello world";
    }
}
