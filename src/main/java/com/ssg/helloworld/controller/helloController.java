package com.ssg.helloworld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class helloController {
    @RequestMapping("/")
    public String hello()
    {
        return "Hello Shubham";
    }
}
