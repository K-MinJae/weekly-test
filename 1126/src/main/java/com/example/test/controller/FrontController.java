package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class FrontController {
    @GetMapping("/")
    public String getPageIndex(){
        return "index";
    }

    @GetMapping("/view")
    public String getPageView(){
        return "view";
    }
}
