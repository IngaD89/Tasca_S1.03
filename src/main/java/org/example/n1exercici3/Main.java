package org.example.n1exercici3;

import java.io.*;
import java.util.*;

public class Main {
    static Map<String, String> countryCapitalMap = new HashMap<>();
    static Map<String, Integer> userScoreMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String response = "";
        String userName = "";
        String randomKey = "";


        try {
            FileReader fileReader = new FileReader("src/main/resources/countries.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] eachWord;
                eachWord = line.split(" ");
                countryCapitalMap.put(eachWord[0], eachWord[1]);
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }

        System.out.println("Introduce tu nombre");
        userName = scanner.nextLine();

        User user = new User(userName);

        ArrayList<String> keyList = new ArrayList<>(countryCapitalMap.keySet());
        Random random = new Random();

        for (int i = 0; i < 2; i++) {
            randomKey = keyList.get(random.nextInt(keyList.size()));
            System.out.println("Adivina capital de " + randomKey);
            response = scanner.nextLine();
            if (response.equals(countryCapitalMap.get(randomKey))) {
                user.setScore((user.getScore() + 1));
            }
            userScoreMap.put(user.getName(),  user.getScore());
            System.out.println(userScoreMap);
            try {
                File file = new File("src/main/resources/classification.txt");
                FileWriter writer = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.write(String.valueOf(userScoreMap));

                bufferedWriter.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

}
