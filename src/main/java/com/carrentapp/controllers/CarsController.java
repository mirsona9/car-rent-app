package com.carrentapp.controllers;

import com.carrentapp.dto.FilterDto;
import com.carrentapp.model.Car;
import com.carrentapp.services.CarService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CarsController {
    @NonNull protected CarService carService;

    @GetMapping("/cars")
    public String cars(FilterDto filter, ModelMap map) {
        List<Car> result = new ArrayList<>();
        map.addAttribute("menu", "cars");

        if (filter.getPickUp() != null && filter.getDropOff() != null && filter.getPickUp().compareTo(filter.getDropOff()) > 0) {
            map.addAttribute("message", "PickUp date is greater than DropOff date!");
        }
        else if ((filter.getPickUp() != null && filter.getDropOff() == null) || (filter.getPickUp() == null && filter.getDropOff() != null)) {
            map.addAttribute("message", "Both dates should be provided!");
        }
        else {
            result = carService.getFilteredCars(filter);
        }

        map.addAttribute("cars", result);
        map.addAttribute("filter", filter);

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

