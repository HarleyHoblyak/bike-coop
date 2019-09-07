package com.bikeyxe.bikes.bicycle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BicycleController {
    BicycleRepository bicycleRepository;

    public BicycleController(BicycleRepository bicycleRepository) {
        this.bicycleRepository = bicycleRepository;
    }

    @GetMapping("/bicycle")
    public String bicycles(Model model) {
        model.addAttribute("bicycle", new Bicycle());
        return "bicycle";
    }

    @PostMapping("/bicycle")
    public String saveBicycle(@ModelAttribute Bicycle bicycle, Model model) {
        bicycleRepository.save(bicycle);
        return "redirect:/bicycle";
    }
}
