package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/home")
    public String index(){
        return "Hello world";
    }

    @GetMapping(value = "/private")
    public String privateArea(){
        return "Private area";
    }

}