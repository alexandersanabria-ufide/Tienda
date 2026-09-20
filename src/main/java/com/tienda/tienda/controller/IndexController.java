package com.tienda.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/ejemplo2")
    public String ejemplo2() {
        return "ejemplo2";
    }

    @GetMapping("/multimedia")
    public String multimedia() {
        return "multimedia";
    }

    @GetMapping("/iframes")
    public String iframes() {
        return "iframes";
    }
}