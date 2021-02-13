package com.jambulud.springpetclinic.model;

public class Person extends BaseEntity {

    private static final long serialVersionUID = 382555506387137338L;
    
    private String firstName;
    private String lastName;

    public Person() {
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
