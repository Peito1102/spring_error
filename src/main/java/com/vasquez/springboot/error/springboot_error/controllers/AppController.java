package com.vasquez.springboot.error.springboot_error.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/error")
public class AppController {
    @GetMapping("/app")
    public String index() {
        return "Hola rey";
    }
    
}
