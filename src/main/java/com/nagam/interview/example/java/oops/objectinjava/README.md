# Understanding Objects in Java

## What is an Object in Java?

In Java, an object is an instance of a class. Objects are created based on the blueprint defined by a class and have the following characteristics:

- **State:** Represented by fields (attributes) in a class. For example, the state of a `Car` object might include its make, model, and year.
- **Behavior:** Defined by methods in a class. For instance, a `Car` object might have methods to start the engine or display its details.
- **Identity:** Each object has a unique identity that distinguishes it from other objects. This identity is typically associated with its memory location.

### Example of an Object

Here’s a simple example to demonstrate the concept of an object in Java:

```java
package com.nagam.interview.example.java.oops.objectinjava;

public class ObjectExample {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car car = new Car("Toyota", "Corolla", 2020);

        // Use the Car class methods
        System.out.println("Car Details:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

        // Modify the car's year and display updated details
        car.setYear(2021);
        System.out.println("Updated Year: " + car.getYear());
    }
}

// Definition of the Car class
class Car {
    private String make; // Field
    private String model; // Field
    private int year; // Field

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }
}
```

### Explanation
- ***Fields***: The Car class has three fields: make, model, and year. These fields represent the state of a Car object.
- ***Constructor***: The constructor Car(String make, String model, int year) initializes the fields when a new Car object is created.
- ***Methods***: The getMake(), setMake(), getModel(), setModel(), getYear(), and setYear() methods are used to access and modify the Car object's fields.

In the ObjectExample class, we create an instance of the Car class, use its methods to get and update the car's details, and display these details to the console.

### Summary

- ***Object***: An instance of a class that represents a specific entity with state, behavior, and identity.
- ***Example Code (ObjectExample.java)***: Demonstrates how to create and use an object in Java, showing its fields, constructor, and methods.



