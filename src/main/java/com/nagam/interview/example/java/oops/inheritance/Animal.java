package com.nagam.interview.example.java.oops.inheritance;

// Base class (superclass)
class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to be overridden by subclasses
    public void speak() {
        System.out.println("The animal makes a sound.");
    }
}