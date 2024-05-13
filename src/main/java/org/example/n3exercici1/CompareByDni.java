package org.example.n3exercici1;

import java.util.Comparator;

public class CompareByDni implements Comparator<Person> {
    @Override
    public int compare(Person person, Person anotherPerson) {
        return person.getDni().compareTo(anotherPerson.getDni());
    }

    @Override
    public Comparator<Person> reversed() {
        return Comparator.super.reversed();
    }
}
