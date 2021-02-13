package com.jambulud.springpetclinic.services;

import java.util.Set;

import com.jambulud.springpetclinic.model.Owner;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
