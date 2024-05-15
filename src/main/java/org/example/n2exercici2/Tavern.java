package org.example.n2exercici2;

import java.util.Comparator;

public class Tavern implements Comparable<Tavern> {
    private String name;
    private int score;

    public Tavern(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Tavern anotherTavern) {
        int compareValue = this.name.compareTo(anotherTavern.name);
        if (compareValue != 0) {
            return compareValue;
        }
        return Integer.compare(this.score, anotherTavern.score);
    }

    @Override
    public String toString() {
        return
                "" + this.name  +
                " " + this.score;
    }
}
