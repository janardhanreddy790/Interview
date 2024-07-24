package com.nagam.interview.example.java.introduction.WhatIsClass;

/**
 * This class demonstrates the concept of a class in Java.
 * It includes a simple example of a class with fields, constructors, methods, and how to create and use an object of the class.
 */
public class ClassExample {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person("Alice", 25);

        // Use the Person class methods
        System.out.println("Person Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Change the age and display updated details
        person.setAge(26);
        System.out.println("Updated Age: " + person.getAge());
    }
}