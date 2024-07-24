# Object-Oriented Programming (OOP) Concepts

## Explain the Concept of OOPS and its Principles

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects," which can contain data and code. The core principles of OOP are:

### 1. Encapsulation

**Encapsulation** refers to the bundling of data (variables) and methods (functions) that operate on the data into a single unit or class. It restricts direct access to some of an object's components and can help prevent accidental interference and misuse of the methods and variables.

**Example Code:**
```java
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```


### 2. Inheritance

**Inheritance** is a mechanism wherein a new class inherits the properties and behavior (methods) of an existing class. This promotes code reusability and establishes a natural hierarchy between classes.

**Example Code:**
```java
class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}

```
In this example, Student inherits from Person, meaning it has access to Person's properties and methods, while adding its own property major.

### 3. Polymorphism

**Polymorphism** allows objects of different classes to be treated as objects of a common superclass. It enables a single action to behave differently based on the object that it is acting upon.

**Example Code:**
```java
abstract class Shape {
    abstract void draw();

    public String getType() {
        return "Shape";
    }
}
```
```java

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }

    @Override
    public String getType() {
        return "Circle";
    }
}
```
In this example, Shape is an abstract class with a method draw. The Circle class overrides this method, demonstrating polymorphism where the draw method behaves differently based on the type of Shape.

### 4. Abstraction

**Abstraction** involves hiding the complex implementation details and showing only the necessary features of an object. It helps in reducing complexity by allowing the focus to be on interactions at a higher level.

**Example Code:**
```java
abstract class Vehicle {
    abstract void start();
}
```
```java

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Starting the Car.");
    }
}
```
In this example, Vehicle is an abstract class with an abstract method start. Car provides a concrete implementation of the start method, showing how abstraction allows focusing on what an object does, rather than how it does it.


### Summary

- **Java Class (`OOPConcepts.java`):** Contains examples of encapsulation, inheritance, polymorphism, and abstraction. class shows how encapsulation, inheritance, polymorphism, and abstraction are implemented in Java, providing practical demonstrations of these fundamental OOP principles.
- **README.md:** Describes the core OOP principles and provides example code illustrating each concept.

Feel free to provide the next question whenever you're ready!
