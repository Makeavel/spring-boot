package com.phga.spring1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class controller {

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }



}