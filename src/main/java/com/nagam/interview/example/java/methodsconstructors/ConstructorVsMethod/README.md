# Difference between Constructor and Method in Java

In Java, constructors and methods are both used to define the behavior of a class. However, they serve different purposes and have distinct characteristics.

## Constructors

- **Purpose:** A constructor is used to initialize a newly created object. It sets the initial state of the object.
- **Name:** The name of the constructor must be the same as the name of the class.
- **Return Type:** Constructors do not have a return type, not even `void`.
- **Invocation:** Constructors are automatically called when an object is created using the `new` keyword.
- **Overloading:** You can have multiple constructors in a class, each with different parameters (constructor overloading).

**Example:**

```java
public class MyClass {
    private String name;
    private int age;

    // Constructor
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor called: " + name + " is " + age + " years old.");
    }
}
```


## Methods

- **Purpose:** Methods define the behavior of an object. They are used to perform operations on the object's data or to provide functionality.
- **Name:** Methods can have any name as long as it is a valid identifier and does not conflict with Java keywords.
- **Return Type:** Methods must specify a return type (can be any data type or `void` if no value is returned).
- **Invocation:** Methods are called explicitly using the object of the class.
- **Overloading:** Methods can be overloaded (multiple methods with the same name but different parameters).

**Example:**

```java
public class MyClass {
    private String name;
    private int age;

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```

### Example Code

```java
package com.nagam.interview.example.java.methodsconstructors.ConstructorVsMethod;

public class ConstructorVsMethodExample {
    public static void main(String[] args) {
        // Creating an instance of the MyClass class
        MyClass myObject = new MyClass("John", 30); // Calls the constructor

        // Calling the method
        myObject.displayInfo(); // Calls the method
    }
}
```

```java
class MyClass {
    private String name;
    private int age;

    // Constructor
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor called: " + name + " is " + age + " years old.");
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

```

### Explanation
- ***Constructor***: 
  - ***Purpose***: Initializes the object with specific values.
  - ***Characteristics***:Has the same name as the class, no return type, and is invoked when an object is created.
- ***Method***: 
  - ***Purpose***: Defines actions that can be performed on the object.
  - ***Characteristics***:Can have any valid name, must have a return type, and is called explicitly using the object.


### Summary

- ***Constructor***: An instance of a class that represents a specific entity with state, behavior, and identity.
- ***Method***: Demonstrates how to create and use an object in Java, showing its fields, constructor, and methods.
