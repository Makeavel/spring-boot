package com.phga.spring3.controller;

import javax.validation.Valid;

import com.phga.spring3.model.empregoM;
import com.phga.spring3.view.empregoInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class empregoC {

    @Autowired
    empregoInterface empregoInterface;

    @RequestMapping("/")
    public String listaEmpregos (Model model){
        model.addAttribute("emprego" , empregoInterface.findAll());
        return "list";
    }
    
    @GetMapping("/add")
    public String empregoFora(Model model){
    model.addAttribute("emprego", new empregoM());
    return "empregoForm";
    }

    @PostMapping("/process")
    public String empregoForm(@Valid empregoM emprego, BindingResult result){
        if(result.hasErrors()){
            return "empregoForm";
        }
        empregoInterface.save(emprego);
        return "reditect:/";
    }

}