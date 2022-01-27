package com.boot.code;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wen
 * @date 8/27/2021 12:19
 */
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello(){

        return "Hello Spring Boot";
    }
}
