package com.carrentapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarsController {
    @GetMapping("/cars")
    public String cars(ModelMap map) {
        map.addAttribute("menu", "cars");
        return "car/index";
    }

    @GetMapping("/cars/detail")
    public String detail(ModelMap map) {
        map.addAttribute("menu", "detail");
        return "detail/index";
    }
    @PostMapping("/cars/detail/rent")
    public String rent(ModelMap map) {
        map.addAttribute("menu", "detail");
        return "detail/index";
    }

}

