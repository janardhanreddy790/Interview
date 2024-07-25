# How Exception Handling Works in Java

Exception handling in Java is a powerful mechanism to handle runtime errors, ensuring the normal flow of the program. Java provides a robust framework to handle exceptions using `try`, `catch`, `finally`, `throw`, and `throws` constructs.

### Key Components:

1. **`try` block**:
    - Encloses code that might throw an exception.
    - If an exception occurs, the rest of the `try` block is skipped.

2. **`catch` block**:
    - Catches and handles the exception thrown by the `try` block.
    - Multiple `catch` blocks can be used to handle different types of exceptions.

3. **`finally` block**:
    - Contains code that will always execute, regardless of whether an exception occurred or not.
    - Typically used for cleanup activities like closing resources.

4. **`throw` keyword**:
    - Used to explicitly throw an exception.

5. **`throws` keyword**:
    - Indicates that a method might throw certain exceptions, notifying the calling method to handle or further propagate them.

### Example: ExceptionHandlingExample.java

This example demonstrates how to use the `try`, `catch`, `finally`, `throw`, and `throws` constructs to handle exceptions in Java.

```java
package com.nagam.interview.example.java.exceptionhandling.exceptionhandle;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the specific exception
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Code that will always execute
            System.out.println("Execution completed.");
        }
    }

    // Method to perform division
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
```

### Explanation
- ***`try` block***: Encloses the code that might throw an exception. In this case, the division operation is performed inside the `try` block.
- ***`catch` block***: Catches and handles the specific exception (`ArithmeticException`) and a generic exception (`Exception`). When dividing by zero, an `ArithmeticException` is thrown, and the corresponding `catch` block handles it.
- ***`finally` block***: Contains code that will always execute, whether an exception is thrown or not. It is used here to print "Execution completed."
- ***`throw` keyword***: Used in the `divide` method to indicate that an `ArithmeticException` might be thrown.
- ***`throws` keyword***: Indicates in the method signature that the method might throw an `ArithmeticException`.


### Summary

- ***Exception Handling***: Mechanism to handle runtime errors, ensuring the normal flow of the application.
- ***`try` block***: Encloses the code that might throw an exception.
- ***`catch` block***: Catches and handles the specific exception.
- ***`finally` block***: Always executes, typically used for cleanup.
- ***`throw` keyword***: Used to explicitly throw an exception.
- ***`throws` keyword***: Indicates potential exceptions a method might throw.
