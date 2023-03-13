package com.carrentapp.controllers;

import com.carrentapp.dto.FilterDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("menu", "home");
        map.addAttribute("filter", new FilterDto());
        return "home/index";
    }
}
