package org.example.n3exercici1;


import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String dni;

    public Person() {
    }

    public Person(String[] attributePosition) {
        this.firstName = attributePosition[0];
        this.lastName = attributePosition[1];
        this.dni = attributePosition[2];
    }

    public Person(String firstName, String lastName, String dni) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
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

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    @Override
    public String toString() {
        return String.format(" %-15s  %-20s  %-20s ", this.firstName, this.lastName, this.dni);
    }
}
