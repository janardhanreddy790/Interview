package com.nagam.interview.example.java.LoopsControlStatements.TypesOfLoops;

public class LoopExamples {

    public static void main(String[] args) {
        // 1. For Loop
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // 2. While Loop
        System.out.println("\nWhile Loop:");
        int count = 0;
        while (count < 5) {
            System.out.println("Iteration: " + count);
            count++;
        }

        // 3. Do-While Loop
        System.out.println("\nDo-While Loop:");
        int number = 0;
        do {
            System.out.println("Iteration: " + number);
            number++;
        } while (number < 5);

        // 4. Enhanced For Loop (for-each)
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}