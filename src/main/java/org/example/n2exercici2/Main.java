package org.example.n2exercici2;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tavern tavern1 = new Tavern("Aura", 4);
        Tavern tavern2 = new Tavern("Ola", 2);
        Tavern tavern3 = new Tavern("Gura", 5);
        Tavern tavern4 = new Tavern("Aura", 4);
        Tavern tavern5 = new Tavern("Aura", 3);
        Tavern tavern6 = new Tavern("Bla", 3);

        int option = 0;
        TreeSet<Tavern> taverns;

        do {
            System.out.println("""
                    Escoge una opción:
                    1. Ordenar por puntuación
                    2. Ordenar por nombre
                    3. Salir del programa
                    """);

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    TavernScoreComparator scoreComparator = new TavernScoreComparator();
                    taverns = new TreeSet<>(scoreComparator);

                    taverns.add(tavern1);
                    taverns.add(tavern2);
                    taverns.add(tavern3);
                    taverns.add(tavern4);
                    taverns.add(tavern5);
                    taverns.add(tavern6);

                    for (Tavern tavern : taverns) {
                        System.out.println(tavern);
                    }
                    break;
                case 2:
                    TavernNameComparator nameComparator = new TavernNameComparator();
                    taverns = new TreeSet<>(nameComparator);

                    taverns.add(tavern1);
                    taverns.add(tavern2);
                    taverns.add(tavern3);
                    taverns.add(tavern4);
                    taverns.add(tavern5);
                    taverns.add(tavern6);

                    for (Tavern tavern : taverns) {
                        System.out.println(tavern);
                    }
                    break;
                case 3:
                    System.out.println("Hasta luego");
                    break;
            }
        } while (option != 3);
    }

}
