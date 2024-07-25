package com.nagam.interview.example.java.LoopsControlStatements.InfiniteLoop;

public class InfiniteLoopExample {

    public static void main(String[] args) {
        int counter = 0;

        while (true) {
            System.out.println("Iteration: " + counter);
            counter++;
            if (counter == 10) {
                System.out.println("Stopping the infinite loop for demonstration purposes.");
                break;
            }
        }
    }
}