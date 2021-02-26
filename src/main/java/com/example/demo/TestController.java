package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
public class TestController {


    @RequestMapping("/hello")
    public String hello(){
        log.error("hello kubernetes!" + "O(∩_∩)O");
        return "hello minikube k8s!" + new Date();

    }

}
