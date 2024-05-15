package org.example.n1exercici2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> orderedNumberList = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        ListIterator<Integer> numIt = numbers.listIterator();

        System.out.println();
        System.out.println("Initial list");
        while (numIt.hasNext()) {
            int num = numIt.next();
            System.out.println(num);
        }
        System.out.println(numbers);

        while (numIt.hasPrevious()) {
            int num;
            num = numIt.previous();
            orderedNumberList.add(num);
        }

        System.out.println();
        System.out.println("Reversed list");
        for (Integer number : orderedNumberList){
            System.out.println(number);
        }

        System.out.println(orderedNumberList);

    }
}
