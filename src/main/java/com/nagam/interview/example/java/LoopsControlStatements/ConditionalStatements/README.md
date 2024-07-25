# Different Types of Conditional Statements in Java

Conditional statements are used to perform different actions based on different conditions. Java provides several types of conditional statements, including `if`, `if-else`, `if-else-if`, and `switch`.

### Example: ConditionalStatementsExample.java

This example demonstrates various types of conditional statements in Java.

```java
package com.nagam.interview.example.java.LoopsControlStatements.ConditionalStatements;

public class ConditionalStatementsExample {

    public static void main(String[] args) {
        int number = 10;

        // if statement
        if (number > 0) {
            System.out.println("if statement:");
            System.out.println("The number is positive.");
            System.out.println("---***---");
        }

        // if-else statement
        if (number < 0) {
            System.out.println("if-else statement:");
            System.out.println("The number is negative.");
            System.out.println("---***---");
        } else {
            System.out.println("if-else statement:");
            System.out.println("The number is non-negative.");
            System.out.println("---***---");
        }

        // if-else-if ladder
        if (number < 0) {
            System.out.println("if-else-if ladder:");
            System.out.println("The number is negative.");
            System.out.println("---***---");
        } else if (number == 0) {
            System.out.println("if-else-if ladder:");
            System.out.println("The number is zero.");
            System.out.println("---***---");
        } else {
            System.out.println("if-else-if ladder:");
            System.out.println("The number is positive.");
            System.out.println("---***---");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("switch statement:");
                System.out.println("Wednesday");
                System.out.println("---***---");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
    }
}
```

### Explanation

- `if` Statement

  - Syntax:
      ```java
      if (condition) {
          // code to be executed if the condition is true
      }
    
      ```

  - Usage: Executes a block of code if the specified condition is true.
  - Example:
      ```java
      if (number > 0) {
          System.out.println("The number is positive.");
      }
      ```

- `if-else` Statement
  - Syntax:
      ```java
      if (condition) {
          // code to be executed if the condition is true
      } else {
          // code to be executed if the condition is false
      }
    
      ```

  - Usage: Executes one block of code if the condition is true, and another block of code if the condition is false.
    - Example:
        ```java
        if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is non-negative.");
        }
    
        ```

- `if-else-if` Ladder

  - Syntax:
      ```java
      if (condition1) {
          // code to be executed if condition1 is true
      } else if (condition2) {
          // code to be executed if condition2 is true
      } else {
          // code to be executed if both condition1 and condition2 are false
      }
    
      ```

  - Usage: Tests multiple conditions sequentially and executes corresponding blocks of code.
    - Example:
      ```java
      if (number < 0) {
          System.out.println("The number is negative.");
      } else if (number == 0) {
          System.out.println("The number is zero.");
      } else {
          System.out.println("The number is positive.");
      }
    
      ```

- `switch` Statement
  - Syntax:

    ```java
    switch (variable) {
        case value1:
            // code to be executed if variable == value1
            break;
        case value2:
            // code to be executed if variable == value2
            break;
        // more cases...
        default:
            // code to be executed if variable doesn't match any case
            break;
    }
    
    ```

  - Usage: Selects one of many blocks of code to be executed based on the value of a variable.
    - Example:

        ```java
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
        ```

### Summary
- ***if Statement***: Executes a block of code if a condition is true.
- ***if-else Statement***: Executes one block of code if a condition is true, and another block if it is false.
- ***if-else-if Ladder***: Tests multiple conditions sequentially.
- ***switch Statement***: Selects a block of code to execute based on the value of a variable.