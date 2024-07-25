package com.nagam.interview.example.java.oops.polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myDog = new Dog();       // Animal reference but Dog object
        Animal myCat = new Cat();       // Animal reference but Cat object

        myAnimal.sound(); // Outputs: Animal makes a sound
        myDog.sound();    // Outputs: Dog barks
        myCat.sound();    // Outputs: Cat meows
    }
}