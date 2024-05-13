package org.example.n2exercici1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Set<Restaurant> restaurants = new HashSet<>();

        Restaurant restaurant1 = new Restaurant("Rest aura", 4);
        Restaurant restaurant2 = new Restaurant("Hola", 2);
        Restaurant restaurant3 = new Restaurant("Hello aura", 3);
        Restaurant restaurant4 = new Restaurant("Rest aura", 4);

        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        restaurants.add(restaurant3);
        restaurants.add(restaurant4);

        for (Restaurant rest : restaurants){
            System.out.println(rest);
        }

       

    }
}
