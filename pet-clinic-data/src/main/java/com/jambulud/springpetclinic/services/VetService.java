package com.jambulud.springpetclinic.services;

import java.util.Set;

import com.jambulud.springpetclinic.model.Vet;

public interface VetService {
    
    Vet findById(Long id);
    
    Vet save(Vet vet);

    Set<Vet> findAll();
}
