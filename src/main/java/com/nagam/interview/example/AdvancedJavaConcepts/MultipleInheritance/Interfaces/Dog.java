package com.nagam.interview.example.AdvancedJavaConcepts.MultipleInheritance.Interfaces;

class Dog implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }
}