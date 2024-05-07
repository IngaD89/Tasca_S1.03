package org.example.n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Month january = new Month("Januari");
        Month february = new Month("february");
        Month march = new Month("march");
        Month april = new Month("april");
        Month may = new Month("may");
        Month june = new Month("june");
        Month july = new Month("july");
        Month august = new Month("august");
        Month september = new Month("september");
        Month october = new Month("october");
        Month november = new Month("november");
        Month december = new Month("december");
        Month december1 = new Month("december");

        ArrayList<Month> months = new ArrayList<>();
        months.add(january);
        months.add(february);
        months.add(march);
        months.add(april);
        months.add(may);
        months.add(june);
        months.add(july);
        months.add(september);
        months.add(october);
        months.add(november);
        months.add(december);

        System.out.println();
        System.out.println("ArrayList before add august: \n");
        for(int i = 0; i < months.size(); i++){
            System.out.println(i + " . " + months.get(i));
        }

        months.add(7, august);

        System.out.println();
        System.out.println("ArrayList after august added: \n");
        for(int i = 0; i < months.size(); i++){
            System.out.println(i + " . " + months.get(i));
        }

        Set<Month> setOfMonths = new HashSet<>();
        setOfMonths.add(january);
        setOfMonths.add(february);
        setOfMonths.add(march);
        setOfMonths.add(april);
        setOfMonths.add(may);
        setOfMonths.add(june);
        setOfMonths.add(july);
        setOfMonths.add(september);
        setOfMonths.add(october);
        setOfMonths.add(november);
        setOfMonths.add(december);

        System.out.println();
        System.out.println("Set of months");
        for(Month month : setOfMonths){
            System.out.println(month);
        }

        setOfMonths.add(august);
        setOfMonths.add(december1);


        System.out.println();
        System.out.println("Set of months, check if it adds repeated elements");
        Iterator<Month> monthIt = setOfMonths.iterator();
        for(int i = 0; i < setOfMonths.size(); i++){
            Month month = monthIt.next();
            System.out.println(i + " " + month);
        }

        System.out.println();
        System.out.println("Loop list with Iterator");
        Iterator<Month> monthIterator = setOfMonths.iterator();

        while (monthIterator.hasNext()){
            Month m = monthIterator.next();
            System.out.println(m);
        }
    }
}