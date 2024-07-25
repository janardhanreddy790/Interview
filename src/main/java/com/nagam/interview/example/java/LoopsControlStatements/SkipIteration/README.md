# How to Skip the Current Iteration in Java

In Java, you can skip the current iteration of a loop using the `continue` statement. When the `continue` statement is encountered inside a loop, the control jumps to the beginning of the next iteration of the loop, effectively skipping any code in between.

### Syntax

```java
continue;
```

### Example: SkipIterationExample.java
This example demonstrates the use of the `continue` statement to skip printing even numbers in a loop from 1 to 10.

```java
package com.nagam.interview.example.java.LoopsControlStatements.SkipIteration;

public class SkipIterationExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // Skip the current iteration if the number is even
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Number: " + i);
        }
    }
}
```

### Explanation
- ***Loop Initialization***: The loop variable `i` is initialized to `1` and will run until `i` is less than or equal to `10`.
- ***Condition Check***: Inside the loop, there is a condition to check if `i` is an even number (`i % 2 == 0`).
- ***Continue Statement***: If the condition is true (i.e., `i` is even), the `continue` statement is executed, which skips the rest of the code inside the loop and moves to the next iteration.
- ***Output***: Only odd numbers are printed since even numbers are skipped.

### Key Points
- ***Control Flow***: The `continue` statement alters the normal control flow of the loop by skipping the remaining code for the current iteration and jumping to the next iteration.
- ***Use Cases***: Useful when certain conditions need to be bypassed within a loop without terminating the loop entirely.

### Use Cases
- Skipping invalid or unwanted data during iteration.
- Avoiding specific conditions within a loop while continuing to process the remaining elements.

### Summary
- ***Continue Statement***: Used to skip the current iteration and proceed with the next iteration of the loop.
- ***Example Code***: Demonstrates skipping even numbers in a loop from 1 to 10 using the continue statement.
