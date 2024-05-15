package org.example.n3exercici1;

import com.opencsv.CSVReader;

import java.io.*;
import java.util.*;

public class Main {

    static int option = 0;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("""
                    Escoge una opción: 
                    1.- Introduir persona.
                    2.- Mostrar les persones ordenades per nom (A-Z).                                
                    3.- Mostrar les persones ordenades per nom (Z-A).                                
                    4.- Mostrar les persones ordenades per cognoms (A-Z).                                
                    5.- Mostrar les persones ordenades per cognoms (Z-A).                                
                    6.- Mostrar les persones ordenades per DNI (1-9).                                
                    7.- Mostrar les persones ordenades per DNI (9-1).                                
                    0.- Sortir.
                    """);

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:
                    break;
                case 2:
                    readFromFile();
                    break;
                case 3:
                    readFromFile();
                    break;
                case 4:
                    readFromFile();
                    break;
                case 5:
                    readFromFile();
                    break;
                case 6:
                    readFromFile();
                    break;
                case 7:
                    readFromFile();
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
            }
            System.out.println();
        } while (option != 0);

    }

    public static void readFromFile() {
        Set<Person> personList = null;

        if (option == 2) {
            CompareByName comparePersonByName = new CompareByName();
            personList = new TreeSet<>(comparePersonByName);
        } else if (option == 3) {
            CompareByName comparePersonByName = new CompareByName();
            personList = new TreeSet<>(comparePersonByName.reversed());
        } else if (option == 4) {
            CompareByLastName compareByLastName = new CompareByLastName();
            personList = new TreeSet<>(compareByLastName);
        } else if (option == 5) {
            CompareByLastName compareByLastName = new CompareByLastName();
            personList = new TreeSet<>(compareByLastName.reversed());
        } else if (option == 6) {
            CompareByDni compareByDni = new CompareByDni();
            personList = new TreeSet<>(compareByDni);
        } else if (option == 7) {
            CompareByDni compareByDni = new CompareByDni();
            personList = new TreeSet<>(compareByDni.reversed());
        }

        Person person;
        try {
            File file = new File("src/main/resources/person.csv");
            Reader reader = new FileReader(file);
            CSVReader csvReader = new CSVReader(reader);
            // BufferedReader bufferedReader = new BufferedReader(reader);
            // String line = "";
            String[] attributePosition;
            while ((attributePosition = csvReader.readNext()) != null) {
                // attributePosition = line.split(",");
                person = new Person(attributePosition);
                if (personList != null) {
                    personList.add(person);
                }
            }
            if (personList != null) {
                System.out.println("_Nombre_____________Apellido_______________DNI");
                for (Person p : personList) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            System.out.println("File not found exception");
        }

    }

}
