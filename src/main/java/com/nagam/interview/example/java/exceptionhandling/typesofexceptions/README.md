# Different Types of Exceptions in Java

In Java, exceptions are categorized into different types based on their nature and how they are handled. Here’s a breakdown of the different types of exceptions:

## 1. Checked Exceptions

Checked exceptions are exceptions that the compiler requires you to either handle or declare in the method signature using the `throws` keyword. These exceptions are checked at compile-time, and failure to handle or declare them will result in a compile-time error. Examples include `IOException`, `SQLException`, and `FileNotFoundException`.

**Example:**

```java
public static void throwCheckedException() throws IOException {
    throw new IOException("This is a checked exception.");
}
```

## 2. Unchecked Exceptions

Unchecked exceptions are exceptions that are not checked at compile-time but rather at runtime. These are also known as runtime exceptions and include exceptions like ArithmeticException, NullPointerException, and ArrayIndexOutOfBoundsException. They are not required to be declared or handled explicitly.

**Example:**

```java
public static void throwUncheckedException() {
    throw new ArithmeticException("This is an unchecked exception.");
}
```

## 3. Errors

Errors are used to indicate serious problems that a reasonable application should not try to catch. These problems are usually related to the JVM and are not meant to be handled by applications. Examples include OutOfMemoryError, StackOverflowError, and VirtualMachineError.

**Example:**

```java
public static void throwError() {
    throw new OutOfMemoryError("This is an error.");
}
```

### Example of Usage

Here's a complete example demonstrating the usage of different types of exceptions:

**Example:**

```java
package com.nagam.interview.example.ExceptionHandling;

public class TypesOfExceptions {
    public static void main(String[] args) {
        // Example of checked exception
        try {
            throwCheckedException();
        } catch (IOException e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        }

        // Example of unchecked exception
        try {
            throwUncheckedException();
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: " + e.getMessage());
        }

        // Example of error (though it is not typically caught)
        try {
            throwError();
        } catch (OutOfMemoryError e) {
            System.out.println("Caught Error: " + e.getMessage());
        }
    }

    // Example of checked exception
    public static void throwCheckedException() throws IOException {
        throw new IOException("This is a checked exception.");
    }

    // Example of unchecked exception
    public static void throwUncheckedException() {
        throw new ArithmeticException("This is an unchecked exception.");
    }

    // Example of an error
    public static void throwError() {
        throw new OutOfMemoryError("This is an error.");
    }
}
```

### Explanation
- ***Checked Exceptions***: Must be handled or declared in the method signature. They are generally used for recoverable conditions.
- ***Unchecked Exceptions***: Do not need to be declared or handled. They are usually used for programming errors and are runtime exceptions.
- ***Errors***: Indicate serious problems that typically cannot be handled by applications.

In the ObjectExample class, we create an instance of the Car class, use its methods to get and update the car's details, and display these details to the console.

### Summary

- ***Checked Exception***: Enforced at compile-time. Must be handled or declared.
- ***Unchecked Exception***: Not enforced at compile-time. Can be handled or ignored.
- ***Error***: Represents severe issues that applications should not attempt to handle.

