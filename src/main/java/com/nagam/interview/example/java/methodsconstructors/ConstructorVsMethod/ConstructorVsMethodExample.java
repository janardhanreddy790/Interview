package com.nagam.interview.example.java.methodsconstructors.ConstructorVsMethod;

/**
 * This class demonstrates the differences between constructors and methods in Java.
 */
public class ConstructorVsMethodExample {
    public static void main(String[] args) {
        // Creating an instance of the MyClass class
        MyClass myObject = new MyClass("John", 30); // Calls the constructor

        // Calling the method
        myObject.displayInfo(); // Calls the method
    }
}