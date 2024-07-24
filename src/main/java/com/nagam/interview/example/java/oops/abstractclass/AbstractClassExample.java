package com.nagam.interview.example.java.oops.abstractclass;

/**
 * This class demonstrates the concept of an abstract class in Java.
 * It includes an example of an abstract class and how to extend and use it.
 */
public class AbstractClassExample {
    public static void main(String[] args) {
        // Create an instance of the ConcreteClass which extends AbstractClass
        ConcreteClass concrete = new ConcreteClass();
        concrete.displayMessage(); // Calls the overridden method
    }
}