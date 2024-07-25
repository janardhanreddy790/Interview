package com.nagam.interview.example.java.methodsconstructors.Constructors;

public class ConstructorsExample {
    public static void main(String[] args) {
        // Create a new Person object using the constructor
        Person person = new Person("Alice", 30);

        // Print initial values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modify values using setters
        person.setName("Bob");
        person.setAge(35);

        // Print modified values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}