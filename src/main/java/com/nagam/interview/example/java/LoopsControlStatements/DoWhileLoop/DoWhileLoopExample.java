package com.nagam.interview.example.java.LoopsControlStatements.DoWhileLoop;

public class DoWhileLoopExample {

    public static void main(String[] args) {
        int number = 0;

        System.out.println("Do-While Loop:");
        do {
            System.out.println("Iteration: " + number);
            number++;
        } while (number < 5);
    }
}