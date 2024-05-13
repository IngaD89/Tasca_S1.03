package org.example.n3exercici1;

import java.util.Comparator;

public class CompareByName implements Comparator<Person> {
    @Override
    public int compare(Person person, Person anotherPerson) {
        return person.getFirstName().compareTo(anotherPerson.getFirstName());
    }

    @Override
    public Comparator<Person> reversed() {
        return Comparator.super.reversed();
    }
}
