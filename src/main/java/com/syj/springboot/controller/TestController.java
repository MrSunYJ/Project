package com.syj.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController

public class TestController {
    @RequestMapping("/helloWorld")
    public String testController(){
        return "testController";
    }
}
