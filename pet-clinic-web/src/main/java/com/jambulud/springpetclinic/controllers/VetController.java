package com.jambulud.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    
    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String vets() {
        return "vet/index";
    }
}