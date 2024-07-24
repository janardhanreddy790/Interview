package com.nagam.interview.example.java.oops.absractclassvsinterface;

// Definition of the abstract class
abstract class AbstractClass {
    // Abstract method (does not have a body)
    abstract void displayMessage();

    // Regular method
    void show() {
        System.out.println("This is a concrete method in an abstract class.");
    }
}