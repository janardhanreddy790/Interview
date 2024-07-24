package com.nagam.interview.example.java.exceptionhandling.typesofexceptions;

import java.io.IOException;

/**
 * This class demonstrates the different types of exceptions in Java.
 * It includes examples of checked exceptions, unchecked exceptions, and errors.
 */
public class TypesOfExceptions {
    public static void main(String[] args) {
        // Example of checked exception
        try {
            throwCheckedException();
        } catch (IOException e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        }

        // Example of unchecked exception
        try {
            throwUncheckedException();
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: " + e.getMessage());
        }

        // Example of error (though it is not typically caught)
        try {
            throwError();
        } catch (OutOfMemoryError e) {
            System.out.println("Caught Error: " + e.getMessage());
        }
    }

    // Example of checked exception
    public static void throwCheckedException() throws IOException {
        throw new IOException("This is a checked exception.");
    }

    // Example of unchecked exception
    public static void throwUncheckedException() {
        throw new ArithmeticException("This is an unchecked exception.");
    }

    // Example of an error
    public static void throwError() {
        throw new OutOfMemoryError("This is an error.");
    }
}