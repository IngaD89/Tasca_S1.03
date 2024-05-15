package org.example.n2exercici2;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        TreeSet<Tavern> taverns = new TreeSet<>();

        Tavern tavern1 = new Tavern("Aura", 5);
        Tavern tavern2 = new Tavern("Ola", 2);
        Tavern tavern3 = new Tavern("Gura", 5);
        Tavern tavern4 = new Tavern("Aura", 4);
        Tavern tavern5 = new Tavern("Aura", 3);
        Tavern tavern6 = new Tavern("Bla", 3);


        taverns.add(tavern1);
        taverns.add(tavern2);
        taverns.add(tavern3);
        taverns.add(tavern4);
        taverns.add(tavern5);
        taverns.add(tavern6);

        for (Tavern tavern : taverns) {
            System.out.println(tavern);
        }
    }

}
