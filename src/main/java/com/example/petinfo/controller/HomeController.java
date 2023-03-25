package com.example.petinfo.controller;

import org.springframework.ui.Model;
import com.example.petinfo.model.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "home/index";
    }

    @PostMapping("/petData")
    public String petData(@ModelAttribute Pet pet, Model model){
        model.addAttribute("Pet", pet);
        return "home/petData";
    }


}
