# Method Overloading and Method Overriding in Java

In Java, method overloading and method overriding are two important concepts that allow developers to define multiple methods with the same name but different functionalities.

## Method Overloading

Method overloading occurs when multiple methods in the same class have the same name but different parameters (different type, number, or both). This allows methods to handle different types of input while maintaining the same method name.

### Key Points:
- **Same Method Name:** Methods have the same name.
- **Different Parameters:** Methods differ in the number or type of parameters.
- **Compile-Time Polymorphism:** Method calls are resolved at compile-time.

### Example:

```java
class OverloadingExample {
    // Method overloading - two methods with the same name but different parameters
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```
In the `OverloadingExample` class, the `add` method is overloaded with two different parameter lists.

## Method Overriding

Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass. The method in the subclass must have the same name, return type, and parameters as the method in the superclass.

### Key Points:
- **Same Method Signature:** Method in subclass has the same name, return type, and parameters as the method in the superclass.
- **Runtime Polymorphism:** Method calls are resolved at runtime.
- **`@Override` Annotation:** Helps ensure that the method is correctly overridden.

### Example:

```java
class Animal {
    // Method to be overridden
    public void speak() {
        System.out.println("The animal makes a sound.");
    }
}
```

```java
class Dog extends Animal {
    // Overriding the speak method from Animal class
    @Override
    public void speak() {
        System.out.println("The dog barks.");
    }
}
```
In the `Dog` class, the `speak` method overrides the `speak` method of the `Animal` class, providing a specific implementation for dogs.


### Example Code

```java
package com.nagam.interview.example.java.oops.methodoverloadingvsoverriding;
/**
 * This class demonstrates the concepts of method overloading and method overriding in Java.
 */
public class MethodOverloadingAndOverridingExample {
    public static void main(String[] args) {
        // Demonstrate method overloading
        OverloadingExample overloadingExample = new OverloadingExample();
        System.out.println("Sum of 2 and 3: " + overloadingExample.add(2, 3));
        System.out.println("Sum of 2, 3, and 4: " + overloadingExample.add(2, 3, 4));

        // Demonstrate method overriding
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.speak(); // Calls Animal's speak method
        dog.speak();    // Calls Dog's overridden speak method
    }
}
```

```java
class OverloadingExample {
    // Method overloading - two methods with the same name but different parameters
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

```java
class Animal {
    // Method to be overridden
    public void speak() {
        System.out.println("The animal makes a sound.");
    }
}
```

```java
class Dog extends Animal {
    // Overriding the speak method from Animal class
    @Override
    public void speak() {
        System.out.println("The dog barks.");
    }
}

```

### Explanation
- ***Method Overloading***: 
  - The `OverloadingExample` class demonstrates method overloading with two `add` methods that have different parameters.
- ***Method Overriding***: 
  - The `Animal` class has a `speak` method that is overridden in the `Dog` class to provide a specific implementation for dogs.


### Summary

- ***Method Overloading***: Multiple methods with the same name but different parameters, resolved at compile-time.
- ***Method Overriding***: A subclass provides a specific implementation for a method defined in its superclass, resolved at runtime.

