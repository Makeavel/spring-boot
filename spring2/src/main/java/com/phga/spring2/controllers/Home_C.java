package com.phga.spring2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Home_C {
    
    @GetMapping("/")
    public String homeController(ModelMap model){
        model.addAttribute("nomeDoAtributo", "Treinauglweb");
        model.addAttribute("nomeAtributo2", "Segunda variavel");
        return "index";
    }

    @GetMapping("/bemVindo")
    public String bmvdo(ModelMap model){
        return "bmvd";
    }



}
