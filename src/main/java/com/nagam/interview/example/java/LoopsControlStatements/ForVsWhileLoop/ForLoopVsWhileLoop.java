package com.nagam.interview.example.java.LoopsControlStatements.ForVsWhileLoop;

public class ForLoopVsWhileLoop {

    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int count = 0;
        while (count < 5) {
            System.out.println("Iteration: " + count);
            count++;
        }
    }
}