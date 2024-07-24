package com.nagam.interview.example.java.exceptionhandling.throwvsthrows;

import java.io.IOException;

/**
 * This class demonstrates the difference between 'throw' and 'throws' in Java.
 * It includes examples of how to use both in exception handling.
 */
public class ThrowVsThrows {
    public static void main(String[] args) {
        try {
            // Method that uses 'throw' to manually throw an exception
            throwException();
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        
        // Method that uses 'throws' to declare that it might throw an exception
        try {
            methodWithThrows();
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    // Example of 'throw': Manually throwing an exception
    public static void throwException() {
        throw new ArithmeticException("This is a manually thrown exception.");
    }

    // Example of 'throws': Declaring that a method might throw an exception
    public static void methodWithThrows() throws IOException {
        // Simulating an exception
        throw new IOException("This is an exception declared with 'throws'.");
    }
}