package com.nagam.interview.example.java.oops.methodoverloadingvsoverriding;

class Dog extends Animal {
    // Overriding the speak method from Animal class
    @Override
    public void speak() {
        System.out.println("The dog barks.");
    }
}