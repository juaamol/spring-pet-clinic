package com.jambulud.springpetclinic.services;

import com.jambulud.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
