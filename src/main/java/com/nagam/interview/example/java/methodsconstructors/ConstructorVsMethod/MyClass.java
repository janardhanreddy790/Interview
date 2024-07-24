package com.nagam.interview.example.java.methodsconstructors.ConstructorVsMethod;

// A class with a constructor and a method
class MyClass {
    private String name;
    private int age;

    // Constructor
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor called: " + name + " is " + age + " years old.");
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}