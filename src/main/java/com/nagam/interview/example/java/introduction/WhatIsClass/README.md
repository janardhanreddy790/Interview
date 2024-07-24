# Introduction to Classes in Java

## What is a Class in Java?

In Java, a class is a blueprint for creating objects. It defines a data type by bundling data and methods that work on the data into a single unit. A class typically includes:

- **Fields:** Variables that store the state of an object.
- **Methods:** Functions that define the behavior of an object.
- **Constructors:** Special methods used to initialize objects when they are created.

### Example of a Class

Here’s a simple example to demonstrate the concept of a class in Java:

```java
package com.nagam.interview.example.Introduction;

public class ClassExample {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person("Alice", 25);

        // Use the Person class methods
        System.out.println("Person Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Change the age and display updated details
        person.setAge(26);
        System.out.println("Updated Age: " + person.getAge());
    }
}

// Definition of the Person class
class Person {
    private String name; // Field
    private int age; // Field

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
```
### Explanation
- ***Fields***: The Person class has two fields: name and age. These fields hold the data for each Person object.
- ***Constructor***: The constructor Person(String name, int age) initializes the fields with values when a new Person object is created.
- ***Methods***: The getName(), setName(), getAge(), and setAge() methods are used to access and modify the Person object's fields.

In the ClassExample class, we create an instance of the Person class, use its methods to get and update the person's details, and display these details to the console.

### Summary

- ***Class***: A template for creating objects, including fields, methods, and constructors.
- ***Example Code (ClassExample.java)***: Demonstrates how to define a class and create an instance of it to use its methods and fields.

