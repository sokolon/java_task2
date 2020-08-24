package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner lineScanner = new Scanner(scanner.nextLine());
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        while (lineScanner.hasNextInt()) {
            list.add(lineScanner.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            int firstNumber = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                int secondNumber = list.get(j);
                if (firstNumber + secondNumber == 13){
                    if (firstNumber < secondNumber){
                        result.add(firstNumber);
                    }
                    else{
                        result.add(secondNumber);
                    }
                }
            }

        }
        Collections.sort(result);
        result.forEach((ele) -> {
            System.out.println(ele + " " + (13 - ele));
        });
    }
}

