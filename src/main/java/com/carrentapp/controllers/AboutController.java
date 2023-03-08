package com.carrentapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
    @GetMapping("/about.html")
    public String cars(ModelMap map) {
        return "home/about";
    }
}
