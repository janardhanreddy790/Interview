package com.nagam.interview.example.java.oops.absractclassvsinterface;

/**
 * This class demonstrates the differences between abstract classes and interfaces in Java.
 * It includes examples of both and how to use them.
 */
public class AbstractVsInterface {
    public static void main(String[] args) {
        // Create an instance of the ConcreteClass which implements the interface and extends the abstract class
        ConcreteClass concrete = new ConcreteClass();
        
        // Using abstract class method
        concrete.displayMessage(); // Calls the overridden method from AbstractClass
        
        // Using interface method
        concrete.interfaceMethod(); // Calls the implemented method from InterfaceExample
    }
}