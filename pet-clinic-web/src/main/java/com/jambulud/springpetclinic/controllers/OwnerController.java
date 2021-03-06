package com.jambulud.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jambulud.springpetclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {

  private final OwnerService ownerService;

  public OwnerController(OwnerService ownerService) {

    this.ownerService = ownerService;
  }

  @RequestMapping({ "", "/", "/index", "/index.html" })
  public String owners(Model model) {

    model.addAttribute("owners", this.ownerService.findAll());

    return "owner/index";
  }

}
