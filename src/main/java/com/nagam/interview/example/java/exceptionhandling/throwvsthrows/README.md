# Difference Between `throw` and `throws` in Java

## What is `throw`?

In Java, the `throw` keyword is used to explicitly throw an exception from a method or block of code. When you use `throw`, you create a new instance of the exception class and throw it to the calling method. This is typically used to manually handle errors or enforce certain conditions in your code.

**Example:**

```java
public static void throwException() {
    throw new ArithmeticException("This is a manually thrown exception.");
}
```
In this example, throw is used to create and throw an ArithmeticException with a custom message.

## What is `throws`?

In Java, The throws keyword is used in a method signature to declare that the method might throw certain exceptions. It is used to inform the calling code that it needs to handle or declare those exceptions. throws does not throw an exception itself; it merely indicates that the method may throw exceptions of the specified types.

**Example:**

```java
public static void methodWithThrows() throws IOException {
    // Simulating an exception
    throw new IOException("This is an exception declared with 'throws'.");
}

```
In this example, throws IOException in the method signature indicates that methodWithThrows might throw an IOException, which must be handled or declared by the calling code.

### Example of Usage and Differences

Here’s an example demonstrating both throw and throws:

```java
package com.nagam.interview.example.java.exceptionhandling.throwvsthrows;

public class ThrowVsThrows {
    public static void main(String[] args) {
        try {
            // Method that uses 'throw' to manually throw an exception
            throwException();
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        
        // Method that uses 'throws' to declare that it might throw an exception
        try {
            methodWithThrows();
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    // Example of 'throw': Manually throwing an exception
    public static void throwException() {
        throw new ArithmeticException("This is a manually thrown exception.");
    }

    // Example of 'throws': Declaring that a method might throw an exception
    public static void methodWithThrows() throws IOException {
        // Simulating an exception
        throw new IOException("This is an exception declared with 'throws'.");
    }
}

```

### Explanation
- ***throw***: Used to manually throw an exception from within a method or block. This allows you to handle specific conditions or errors by creating and throwing exceptions directly.
- ***throws***: Used in a method declaration to specify that the method can throw one or more exceptions. The method does not handle these exceptions; instead, it passes them up the call stack to be handled by the caller.


### Summary

- ***throw***: Creates and throws an exception explicitly in your code.
- ***throws***: Declares that a method might throw exceptions, requiring the calling code to handle or declare these exceptions.
