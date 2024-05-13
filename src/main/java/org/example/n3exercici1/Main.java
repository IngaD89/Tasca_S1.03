package org.example.n3exercici1;

import com.opencsv.CSVReader;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)  {


        Scanner scanner = new Scanner(System.in);
        int option = 0;

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
                    compareName();
                    break;
                case 3:
                    compareNameReverse();
                    break;
                case 4:
                    compareLastName();
                    break;
                case 5:
                    compareLastNameReverse();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
            }
            System.out.println();
        }while (option != 0);

    }

    public static Set<Person> readFromFile(){
        Set<Person> personList = new HashSet<>();

        Person person = null;
        File file = new File("src/main/resources/person.csv");
        try {
            Reader reader = new FileReader(file);
            CSVReader csvReader = new CSVReader(reader);
            // BufferedReader bufferedReader = new BufferedReader(reader);
            // String line = "";
            String[] attributePosition;
            while ((attributePosition = csvReader.readNext()) != null){
                // attributePosition = line.split(",");
                person = new Person(attributePosition);
                System.out.println(person);
                personList.add(person);
            }

        } catch (Exception e) {
            System.out.println("File not found exception");
        }

        return personList;
    }

    public static void compareName(){
        CompareByName comparePersonByName = new CompareByName();
        Set<Person> personList = new TreeSet<>(comparePersonByName);
        Person person = null;

        File file = new File("src/main/resources/person.csv");
        try {
            Reader reader = new FileReader(file);
            CSVReader csvReader = new CSVReader(reader);
            String[] attributePosition;
            while ((attributePosition = csvReader.readNext()) != null){
                // attributePosition = line.split(",");
                person = new Person(attributePosition);
                personList.add(person);
            }
            System.out.println("_Nombre_____________Apellido_______________2DNI");
            for (Person p : personList){
                System.out.println(p);
            }

        } catch (Exception e) {
            System.out.println("File not found exception");
        }

    }

    public static void compareNameReverse(){
        CompareByName comparePersonByName = new CompareByName();
        Set<Person> personList = new TreeSet<>(comparePersonByName.reversed());
        Person person = null;

        File file = new File("src/main/resources/person.csv");
        try {
            Reader reader = new FileReader(file);
            CSVReader csvReader = new CSVReader(reader);
            String[] attributePosition;
            while ((attributePosition = csvReader.readNext()) != null){
                // attributePosition = line.split(",");
                person = new Person(attributePosition);
                personList.add(person);
            }
            System.out.println("_Nombre_____________Apellido_______________2DNI");
            for (Person p : personList){
                System.out.println(p);
            }

        } catch (Exception e) {
            System.out.println("File not found exception");
        }

    }

    public static void compareLastName(){
        CompareByLastName compareByLastName = new CompareByLastName();
        Set<Person> personList = new TreeSet<>(compareByLastName);
        Person person = null;

        File file = new File("src/main/resources/person.csv");
        try {
            Reader reader = new FileReader(file);
            CSVReader csvReader = new CSVReader(reader);
            String[] attributePosition;
            while ((attributePosition = csvReader.readNext()) != null){
                person = new Person(attributePosition);
                personList.add(person);
            }
            System.out.println("_Nombre_____________Apellido_______________2DNI");
            for (Person p : personList){
                System.out.println(p);
            }

        } catch (Exception e) {
            System.out.println("File not found exception");
        }

    }

    public static void compareLastNameReverse(){
        CompareByLastName compareByLastName = new CompareByLastName();
        Set<Person> personList = new TreeSet<>(compareByLastName.reversed());
        Person person = null;

        File file = new File("src/main/resources/person.csv");
        try {
            Reader reader = new FileReader(file);
            CSVReader csvReader = new CSVReader(reader);
            String[] attributePosition;
            while ((attributePosition = csvReader.readNext()) != null){
                person = new Person(attributePosition);
                personList.add(person);
            }
            System.out.println("_Nombre_____________Apellido_______________2DNI");
            for (Person p : personList){
                System.out.println(p);
            }

        } catch (Exception e) {
            System.out.println("File not found exception");
        }

    }


}
