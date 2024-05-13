package org.example.n2exercici2;

import java.util.Comparator;

public class TavernScoreComparator implements Comparator<Tavern> {

    @Override
    public int compare(Tavern tavern, Tavern anotherTavern) {
        return (tavern.getScore()) - (anotherTavern.getScore());
    }
}
