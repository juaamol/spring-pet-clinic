package com.jambulud.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jambulud.springpetclinic.model.Owner;
import com.jambulud.springpetclinic.model.Vet;
import com.jambulud.springpetclinic.services.OwnerService;
import com.jambulud.springpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;

  private final VetService vetService;

  public DataLoader(OwnerService ownerService, VetService vetService) {

    this.ownerService = ownerService;
    this.vetService = vetService;
  }

  @Override
  public void run(String... args) throws Exception {

    loadData();
  }

  private void loadData() {

    Owner owner1 = new Owner();
    owner1.setFirstName("Michael");
    owner1.setLastName("Weston");
    this.ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("Fiona");
    owner2.setLastName("Glenanne");

    this.ownerService.save(owner2);

    System.out.println("Loaded Owners....");

    Vet vet1 = new Vet();
    vet1.setFirstName("Sam");
    vet1.setLastName("Axe");

    this.vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Jessie");
    vet2.setLastName("Porter");

    this.vetService.save(vet2);

    System.out.println("Loaded Vets....");
  }

}
