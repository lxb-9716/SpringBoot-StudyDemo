package com.it.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SpringBootController")
public class SpringBootController {

    @GetMapping("/testSpringBootController")
    public String testSpringBootController() {
        return "springBoot基本学习!!!，并将此demo上传到了github";
    }
}
