package com.jambulud.springpetclinic.model;

public class PetType extends BaseEntity {

    private static final long serialVersionUID = -7723891623272577910L;
    
    private String name;

    public PetType() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
