package com.nagam.interview.example.java.oops.inheritance;

/**
 * This class demonstrates the concept of inheritance in Java.
 */
public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an instance of the Dog class
        Dog dog = new Dog("Buddy", 5, "Golden Retriever");

        // Accessing properties and methods from both the Dog and Animal classes
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Breed: " + dog.getBreed());

        // Calling the speak method from the Dog class
        dog.speak();
    }
}