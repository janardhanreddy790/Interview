package com.nagam.interview.example.java.oops.objectinjava;

/**
 * This class demonstrates the concept of an object in Java.
 * It includes an example of creating and using objects.
 */
public class ObjectExample {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car car = new Car("Toyota", "Corolla", 2020);

        // Use the Car class methods
        System.out.println("Car Details:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

        // Modify the car's year and display updated details
        car.setYear(2021);
        System.out.println("Updated Year: " + car.getYear());
    }
}