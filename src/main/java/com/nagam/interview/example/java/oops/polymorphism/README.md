# What is Polymorphism in Java?

Polymorphism is one of the core concepts of Object-Oriented Programming (OOP) in Java. It allows objects to be treated as instances of their parent class rather than their actual class. The main benefit of polymorphism is that it enables flexibility and the ability to write more generic and reusable code.

### Types of Polymorphism in Java

1. **Compile-time Polymorphism (Method Overloading)**:
    - Achieved by having multiple methods with the same name but different parameters.
    - The method to be invoked is determined at compile time.

2. **Runtime Polymorphism (Method Overriding)**:
    - Achieved by defining a method in a subclass that is already defined in its superclass.
    - The method to be invoked is determined at runtime.

### Example: PolymorphismExample.java

This example demonstrates runtime polymorphism (method overriding) in Java.

```java
package com.nagam.interview.example.java.oops.polymorphism;

// Base class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
```

```java

// Derived class 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
```

```java

// Derived class 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
```

```java
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
```

### Explanation
- ***Base Class (Animal)***: The `Animal` class defines a method `sound()` that prints "Animal makes a sound".
- ***Derived Classes (Dog and Cat)***: The `Dog` and `Cat` classes override the `sound()` method to provide their own implementation.
- ***Polymorphic Behavior***: In the `main` method, an `Animal` reference is used to point to different subclass objects (`Dog` and `Cat`). The actual method that gets called depends on the object that the reference points to at runtime.


### Summary

- ***Polymorphism***: Allows objects to be treated as instances of their parent class rather than their actual class.
- ***Runtime Polymorphism***: Achieved through method overriding, where the method to be invoked is determined at runtime.
- ***Example Code (PolymorphismExample.java)***: Demonstrates how different subclass methods are called using a base class reference.

