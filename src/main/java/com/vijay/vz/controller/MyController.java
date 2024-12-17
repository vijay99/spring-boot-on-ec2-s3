package com.vijay.vz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/test")
    public String testMethod(){
        return "This is test message from spring boot app running on aws ec2.";
    }
}
