package com.nagam.interview.example.java.oops.OOPConcepts;

/**
 * This class demonstrates the core concepts of Object-Oriented Programming (OOP) in Java.
 * It provides examples of Encapsulation, Inheritance, Polymorphism, and Abstraction.
 */
public class OOPConcepts {
    public static void main(String[] args) {
        // Example of Encapsulation
        Person person = new Person("John Doe", 30);
        System.out.println("Encapsulation Example:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Example of Inheritance
        Student student = new Student("Jane Doe", 20, "Computer Science");
        System.out.println("\nInheritance Example:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Major: " + student.getMajor());

        // Example of Polymorphism
        Shape shape = new Circle();
        System.out.println("\nPolymorphism Example:");
        System.out.println("Shape Type: " + shape.getType());
        shape.draw();

        // Example of Abstraction
        System.out.println("\nAbstraction Example:");
        Vehicle vehicle = new Car();
        vehicle.start();
    }
}