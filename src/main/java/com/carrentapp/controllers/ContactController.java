package com.carrentapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    @GetMapping("/contact.html")
    public String contact(ModelMap map) {
        return "home/contact";
    }
}
