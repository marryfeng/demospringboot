package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengli on 2017/9/6.
 */
@RestController
public class TestController {


    @RequestMapping(value={"/hi"},method = RequestMethod.GET)
    public String testSpringboot(){
        return "hi";
    }
}
