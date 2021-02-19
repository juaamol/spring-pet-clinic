package com.jambulud.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jambulud.springpetclinic.services.VetService;

@Controller
public class VetController {

  private final VetService vetService;

  public VetController(VetService vetService) {

    this.vetService = vetService;
  }

  @RequestMapping({ "/vets", "/vets/index", "/vets/index.html" })
  public String vets(Model model) {

    model.addAttribute("vets", this.vetService.findAll());

    return "vet/index";
  }
}
