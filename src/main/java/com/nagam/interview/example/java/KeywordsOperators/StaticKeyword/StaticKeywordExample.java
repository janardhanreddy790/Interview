package com.nagam.interview.example.java.KeywordsOperators.StaticKeyword;

/**
 * This class demonstrates the purpose and usage of the static keyword in Java.
 */
public class StaticKeywordExample {
    public static void main(String[] args) {
        // Example with static variable
        System.out.println("Static Variable: " + MyClass.staticVar);

        // Example with static method
        MyClass.staticMethod();

        // Creating instances to demonstrate instance variable and method
        MyClass obj1 = new MyClass("Object1");
        MyClass obj2 = new MyClass("Object2");

        // Accessing instance variables and methods
        obj1.instanceMethod();
        obj2.instanceMethod();
        
        // Static variable can be accessed via objects but it's not recommended
        System.out.println("Accessing static variable via obj1: " + obj1.staticVar);
    }
}