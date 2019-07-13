package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/status")
    public String status(){
        return "ok";
    }

    @GetMapping("/jenkins-test")
    public String jenkins(){
        return "oki doki !!";
    }
}
