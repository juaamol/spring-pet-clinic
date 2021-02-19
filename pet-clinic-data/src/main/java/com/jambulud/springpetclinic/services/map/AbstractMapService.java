package com.jambulud.springpetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.jambulud.springpetclinic.model.BaseEntity;

public class AbstractMapService<T extends BaseEntity, ID extends Long> {

  protected Map<Long, T> map = new HashMap<>();

  Set<T> findAll() {

    return new HashSet<>(this.map.values());
  }

  T findById(ID id) {

    return this.map.get(id);
  }

  T save(T object) {

    if (object != null) {
      if (object.getId() == null) {
        object.setId(this.getNextId());
      }

      this.map.put(object.getId(), object);
    } else {
      throw new RuntimeException("Object cannot be null");
    }

    return object;
  }

  void deleteById(ID id) {

    this.map.remove(id);
  }

  private Long getNextId() {

    Set<Long> keys = this.map.keySet();

    if (keys.isEmpty()) {
      return 1L;
    }

    return Collections.max(keys) + 1;
  }

  void delete(T object) {

    this.map.entrySet().removeIf(entry -> entry.getValue().equals(object));
  }

}
