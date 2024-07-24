# What is Inheritance in Java?

Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a new class (subclass) to inherit properties and behavior (methods) from an existing class (superclass). This promotes code reuse and establishes a hierarchical relationship between classes.

## Key Concepts of Inheritance

1. **Superclass (Parent Class):**
    - The class whose properties and methods are inherited by another class.
    - Example: `Animal` class in the provided code.

2. **Subclass (Child Class):**
    - The class that inherits properties and methods from the superclass.
    - Example: `Dog` class in the provided code.

3. **`super` Keyword:**
    - Used to refer to the superclass instance.
    - Can be used to call superclass methods and constructors from the subclass.

4. **Method Overriding:**
    - The subclass can provide a specific implementation of a method that is already defined in its superclass.
    - Example: The `speak` method is overridden in the `Dog` class.

## Example Code

Here’s an example demonstrating inheritance in Java:

```java
package com.nagam.interview.example.Inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an instance of the Dog class
        Dog dog = new Dog("Buddy", 5, "Golden Retriever");

        // Accessing properties and methods from both the Dog and Animal classes
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Breed: " + dog.getBreed());

        // Calling the speak method from the Dog class
        dog.speak();
    }
}

// Base class (superclass)
class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to be overridden by subclasses
    public void speak() {
        System.out.println("The animal makes a sound.");
    }
}

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
```
### Explanation
- ***Animal Class (Superclass):***: 
  - Contains fields `name` and `age`, a constructor to initialize them, and a method `speak()` that prints a generic sound.
  - The `speak()` method is designed to be overridden by subclasses.
- ***Dog Class (Subclass):***: 
  - Inherits fields and methods from the `Animal` class.
  - Adds a new field `breed` and provides its constructor to initialize all fields, using `super()` to call the superclass constructor.
  - Overrides the `speak()` method to provide a specific implementation for dogs.


### Summary

- ***Inheritance***: Allows a class to inherit properties and behavior from another class, promoting code reuse and establishing a hierarchical relationship.
- ***Superclass***: The class being inherited from.
- ***Subclass***: The class that inherits from the superclass.
- ***Method Overriding***: Subclasses can provide specific implementations of methods already defined in the superclass.

