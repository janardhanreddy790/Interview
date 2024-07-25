package com.nagam.interview.example.java.exceptionhandling.exceptionhandle;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the specific exception
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Code that will always execute
            System.out.println("Execution completed.");
        }
    }

    // Method to perform division
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}