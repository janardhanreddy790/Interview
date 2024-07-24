package com.nagam.interview.example.java.oops.methodoverloadingvsoverriding;

/**
 * This class demonstrates the concepts of method overloading and method overriding in Java.
 */
public class MethodOverloadingAndOverridingExample {
    public static void main(String[] args) {
        // Demonstrate method overloading
        OverloadingExample overloadingExample = new OverloadingExample();
        System.out.println("Sum of 2 and 3: " + overloadingExample.add(2, 3));
        System.out.println("Sum of 2, 3, and 4: " + overloadingExample.add(2, 3, 4));

        // Demonstrate method overriding
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.speak(); // Calls Animal's speak method
        dog.speak();    // Calls Dog's overridden speak method
    }
}