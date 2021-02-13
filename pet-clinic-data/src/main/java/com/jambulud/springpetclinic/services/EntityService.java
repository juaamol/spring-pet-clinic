package com.jambulud.springpetclinic.services;

import java.util.Set;

public interface EntityService<T> {

    T findById(Long id);

    T save(T entity);

    Set<T> findAll();
}
