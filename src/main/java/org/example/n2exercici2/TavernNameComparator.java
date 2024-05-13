package org.example.n2exercici2;

import java.util.Comparator;

public class TavernNameComparator implements Comparator<Tavern> {
    @Override
    public int compare(Tavern tavern, Tavern anotherTavern){
        return tavern.getName().compareTo(anotherTavern.getName());
    }


}
