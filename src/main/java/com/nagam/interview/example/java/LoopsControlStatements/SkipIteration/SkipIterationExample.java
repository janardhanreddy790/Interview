package com.nagam.interview.example.java.LoopsControlStatements.SkipIteration;

public class SkipIterationExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // Skip the current iteration if the number is even
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Number: " + i);
        }
    }
}