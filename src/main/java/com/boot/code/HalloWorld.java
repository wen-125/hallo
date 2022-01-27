package com.boot.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wen
 * @date 1/27/2022 09:05
 */
@Controller
public class HalloWorld {

    @ResponseBody
    @RequestMapping(value = "/hallo",method = RequestMethod.GET)
    public String hello(){
        return "hello spring boot!";
    }
}
