package com.nagam.interview.example.java.KeywordsOperators.StaticKeyword;

class MyClass {
    // Static variable
    public static int staticVar = 10;

    // Instance variable
    public String name;

    // Static method
    public static void staticMethod() {
        System.out.println("Static method called. Static variable: " + staticVar);
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Instance method called. Instance name: " + name);
    }

    // Constructor
    public MyClass(String name) {
        this.name = name;
    }
}