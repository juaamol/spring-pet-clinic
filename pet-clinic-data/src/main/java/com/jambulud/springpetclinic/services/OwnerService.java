package com.jambulud.springpetclinic.services;

import com.jambulud.springpetclinic.model.Owner;

public interface OwnerService extends EntityService<Owner> {

    Owner findByLastName(String lastName);

}
