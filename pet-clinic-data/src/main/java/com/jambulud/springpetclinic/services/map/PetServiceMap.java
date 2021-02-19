package com.jambulud.springpetclinic.services.map;

import java.util.Set;

import com.jambulud.springpetclinic.model.Pet;
import com.jambulud.springpetclinic.services.PetService;

import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}