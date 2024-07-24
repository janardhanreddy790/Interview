package com.nagam.interview.example.java.oops.OOPConcepts;

// Polymorphism Example
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }

    @Override
    public String getType() {
        return "Circle";
    }
}