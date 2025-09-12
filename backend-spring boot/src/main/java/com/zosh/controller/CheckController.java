package com.zosh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @GetMapping
    public String getFood(){
        return "Welcom to food app";
    }
}
