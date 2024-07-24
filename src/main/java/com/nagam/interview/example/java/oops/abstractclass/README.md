# Understanding Abstract Classes in Java

## What is an Abstract Class in Java?

In Java, an abstract class is a class that cannot be instantiated on its own and must be extended by other classes. Abstract classes are used to provide a common base for other classes and to define methods that must be implemented by derived classes. They can contain:

- **Abstract Methods:** Methods that are declared without an implementation. Subclasses must provide the implementation for these methods.
- **Concrete Methods:** Regular methods that have a complete implementation.

### Example of an Abstract Class

Here’s a simple example to demonstrate the concept of an abstract class in Java:

```java
package com.nagam.interview.example.java.oops.abstractclass;

public class AbstractClassExample {
    public static void main(String[] args) {
        // Create an instance of the ConcreteClass which extends AbstractClass
        ConcreteClass concrete = new ConcreteClass();
        concrete.displayMessage(); // Calls the overridden method
    }
}
```

```java

// Definition of the abstract class
abstract class AbstractClass {
    // Abstract method (does not have a body)
    abstract void displayMessage();

    // Regular method
    void show() {
        System.out.println("This is a concrete method in an abstract class.");
    }
}
```

```java

// Definition of the concrete class that extends the abstract class
class ConcreteClass extends AbstractClass {
    // Implementation of the abstract method
    @Override
    void displayMessage() {
        System.out.println("This is an implementation of the abstract method.");
    }
}
```

### Explanation
- ***Abstract Class***: The AbstractClass is an abstract class because it contains the abstract method displayMessage(), which does not have a body. This class also contains a regular method show() with a complete implementation.
- ***Concrete Class***: The ConcreteClass extends AbstractClass and provides an implementation for the displayMessage() method. This is required because displayMessage() is abstract in the parent class.
- ***Instantiation***: You cannot create an instance of AbstractClass directly. Instead, you create an instance of ConcreteClass, which provides the implementation for the abstract methods.

In the AbstractClassExample class, we create an instance of ConcreteClass and use its method displayMessage() to demonstrate how abstract methods are implemented in subclasses.

### Summary

- ***Abstract Class***: A class that cannot be instantiated and may contain abstract methods that must be implemented by subclasses.
- ***Example Code (AbstractClassExample.java)***: Demonstrates how to define an abstract class, extend it with a concrete class, and implement abstract methods.

