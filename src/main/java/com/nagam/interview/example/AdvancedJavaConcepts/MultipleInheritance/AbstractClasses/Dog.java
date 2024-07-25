package com.nagam.interview.example.AdvancedJavaConcepts.MultipleInheritance.AbstractClasses;

// Implement both the abstract class and the interface
class Dog extends Animal implements Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }
}