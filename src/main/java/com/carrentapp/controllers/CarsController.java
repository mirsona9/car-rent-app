package com.carrentapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarsController {
    @GetMapping("/cars")
    public String cars(ModelMap map) {
        map.addAttribute("menu", "cars");
        return "car/index";
    }
}

