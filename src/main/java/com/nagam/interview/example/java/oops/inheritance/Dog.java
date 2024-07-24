package com.nagam.interview.example.java.oops.inheritance;

// Derived class (subclass)
class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Getter method
    public String getBreed() {
        return breed;
    }

    // Overriding the speak method
    @Override
    public void speak() {
        System.out.println("The dog barks.");
    }
}