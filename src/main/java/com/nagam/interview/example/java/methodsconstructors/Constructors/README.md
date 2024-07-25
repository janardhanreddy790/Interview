# What are Constructors in Java?

Constructors in Java are special methods that are used to initialize objects. They are called when an object of a class is created. Constructors have the same name as the class and do not have a return type.

### Key Points:
1. **Name**: The constructor name must be the same as the class name.
2. **No Return Type**: Constructors do not have a return type.
3. **Initialization**: They are used to initialize the object's state.

### Example: ConstructorsExample.java

This example demonstrates the use of a constructor to initialize the fields of a `Person` object.

```java
package com.nagam.interview.example.java.methodsconstructors;

class Person {
    private String name;
    private int age;

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

public class ConstructorsExample {
    public static void main(String[] args) {
        // Create a new Person object using the constructor
        Person person = new Person("Alice", 30);

        // Print initial values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modify values using setters
        person.setName("Bob");
        person.setAge(35);

        // Print modified values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
```
### Explanation
- ***Fields***: The `Person` class has two fields: `name` and `age`. These fields hold the data for each `Person` object.
- ***Constructor***: The constructor `Person(String name, int age)` initializes the fields with values when a new `Person` object is created.
- ***Methods***: The `getName(), setName(), getAge(), and setAge()` methods are used to access and modify the `Person` object's fields.

In the `ConstructorsExample` class, we create an instance of the `Person` class, use its methods to get and update the person's details, and display these details to the console.


### Summary

- ***Class***: A template for creating objects, including fields, methods, and constructors.
- ***Class***: A special method used to initialize objects.

