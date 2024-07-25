# Do-While Loop in Java

The `do-while` loop is a control flow statement that executes a block of code at least once, and then repeatedly executes the block based on a given boolean condition. The condition is evaluated after the block of code has been executed, which guarantees that the block will run at least once.

### Syntax

```java
do {
    // code to be executed
} while (condition);
```

### Example: DoWhileLoopExample.java

This example demonstrates the use of a `do-while` loop to print the numbers from 0 to 4.

```java
package com.nagam.interview.example.java.LoopsControlStatements.DoWhileLoop;

public class DoWhileLoopExample {

    public static void main(String[] args) {
        int number = 0;

        System.out.println("Do-While Loop:");
        do {
            System.out.println("Iteration: " + number);
            number++;
        } while (number < 5);
    }
}
```

### Explanation
- ***Initialization***: The variable number is initialized to `0`.
- ***Loop Execution***: The block of code inside the `do` block is executed, printing the current value of `number` and then incrementing it by `1`.
- ***Condition Check***: After the block of code is executed, the condition `number < 5` is checked. If it evaluates to `true`, the loop continues; otherwise, it terminates.

### Key Points
- ***At Least Once Execution***: The `do-while` loop ensures that the code block is executed at least once, regardless of whether the condition is initially `true` or `false`.
- ***Post-Condition Loop***: The condition is evaluated after the execution of the loop body, making it different from the `while` loop, where the condition is checked before the loop body executes.
- ***Use Cases***: Suitable for scenarios where the loop must run at least once, such as user input validation or menu-driven programs.

### Summary
- ***Do-While Loop***: Executes the loop body at least once before checking the condition.
- ***Example Code***: Demonstrates printing numbers from 0 to 4 using a `do-while` loop.
