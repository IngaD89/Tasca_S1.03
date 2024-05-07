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

        Iterator<Integer> numIt = numbers.listIterator();

        System.out.println();
        System.out.println("Initial list");
        while (numIt.hasNext()) {
            int num = numIt.next();
            orderedNumberList.add(num);
            System.out.println(num);

        }

        Collections.reverse(orderedNumberList);

        System.out.println();
        System.out.println("Ordered list");
        for (Integer orderedNumber : orderedNumberList) {
            System.out.println(orderedNumber);
        }
    }
}
