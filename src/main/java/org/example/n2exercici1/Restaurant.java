package org.example.n2exercici1;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
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
    public boolean equals(Object object) {
        if (object instanceof Restaurant restaurant) {
            if (this.name.equals(restaurant.name) && this.score == restaurant.score) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name = '" + this.name + '\'' +
                ", score = " + this.score +
                '}';
    }
}
