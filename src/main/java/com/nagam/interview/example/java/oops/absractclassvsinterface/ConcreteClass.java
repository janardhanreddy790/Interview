package com.nagam.interview.example.java.oops.absractclassvsinterface;

// Definition of the concrete class that extends the abstract class and implements the interface
class ConcreteClass extends AbstractClass implements InterfaceExample {
    // Implementation of the abstract method from AbstractClass
    @Override
    void displayMessage() {
        System.out.println("This is an implementation of the abstract method.");
    }

    // Implementation of the abstract method from InterfaceExample
    @Override
    public void interfaceMethod() {
        System.out.println("This is an implementation of the interface method.");
    }
}