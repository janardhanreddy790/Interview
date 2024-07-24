# Purpose of the `static` Keyword in Java

In Java, the `static` keyword is used to define class-level variables and methods that are shared across all instances of a class. This means that static members belong to the class itself rather than to any specific object instance.

## Key Uses of the `static` Keyword

1. **Static Variables (Class Variables):**
    - **Purpose:** Static variables are shared among all instances of a class. They have a single copy, which is shared by all objects of the class.
    - **Initialization:** Static variables are initialized when the class is loaded.
    - **Access:** Static variables can be accessed directly using the class name or through an object reference.

   **Example:**
   ```java
   public class MyClass {
       public static int staticVar = 10;
   }
   ```

2. **Static Methods:**
    - **Purpose:** Static methods can be called without creating an instance of the class. They can only access static variables and other static methods.
    - **Restrictions:** Static methods cannot access instance variables or instance methods directly.
    - **Access:** Static methods can be called using the class name or an object reference.

   **Example:**
   ```java
   public class MyClass {
    public static void staticMethod() {
        System.out.println("Static method called.");
    }
   }
   ```

3. **Static Blocks:**
    - **Purpose:** Static blocks are used for static initialization of a class. They are executed only once when the class is loaded.
    - **Usage:** Useful for initializing complex static variables.

   **Example:**
   ```java
   public class MyClass {
    static {
        System.out.println("Static block executed.");
    }
   }
   ```
4. **Static Nested Classes:**
    - **Purpose:** Static nested classes are defined within another class and can access the outer class's static members.
    - **Restrictions:** Static nested classes cannot access instance members of the outer class.

   **Example:**
   ```java
   public class OuterClass {
    static class StaticNestedClass {
        public void display() {
            System.out.println("Static nested class.");
        }
    }
   }
   ```
   
### Example Code
Here’s a simple example demonstrating the use of `static` variables and methods:

```java
package com.nagam.interview.example.java.KeywordsOperators.StaticKeyword;

public class StaticKeywordExample {
    public static void main(String[] args) {
        // Example with static variable
        System.out.println("Static Variable: " + MyClass.staticVar);

        // Example with static method
        MyClass.staticMethod();

        // Creating instances to demonstrate instance variable and method
        MyClass obj1 = new MyClass("Object1");
        MyClass obj2 = new MyClass("Object2");

        // Accessing instance variables and methods
        obj1.instanceMethod();
        obj2.instanceMethod();
        
        // Static variable can be accessed via objects but it's not recommended
        System.out.println("Accessing static variable via obj1: " + obj1.staticVar);
    }
}
```

```java
class MyClass {
    // Static variable
    public static int staticVar = 10;

    // Instance variable
    public String name;

    // Static method
    public static void staticMethod() {
        System.out.println("Static method called. Static variable: " + staticVar);
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Instance method called. Instance name: " + name);
    }

    // Constructor
    public MyClass(String name) {
        this.name = name;
    }
}
```

### Explanation
- ***Static Variables***: `staticVar` is shared among all instances of `MyClass`. It can be accessed using `MyClass.staticVar` or through an object instance, though the latter is not recommended.
- ***Static Methods***: `staticMethod` can be called without creating an instance of `MyClass`. It can only access `staticVar` directly.
- ***Instance Variables/Methods***: These belong to specific instances of the class and are accessed through object references.


### Summary

- ***Static Keyword***: Used to define class-level variables and methods that are shared among all instances of a class.
- ***Static Variables:***: Shared among all instances.
- ***Static Methods:***: Can be called without creating an instance; can only access static variables and methods.



