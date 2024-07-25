# What is an Infinite Loop and How Can You Create One?

An infinite loop is a loop that runs indefinitely because the terminating condition is never met. Infinite loops are typically created by design for scenarios where the program needs to keep running continuously, such as in server applications, or they can occur unintentionally due to logical errors.

### Example of an Infinite Loop

An infinite loop can be created using various looping constructs like `while`, `for`, or `do-while`. Here's an example using a `while` loop:

```java
package com.nagam.interview.example.java.loops;

public class InfiniteLoopExample {

    public static void main(String[] args) {
        int counter = 0;

        while (true) {
            System.out.println("Iteration: " + counter);
            counter++;
            if (counter == 10) {
                System.out.println("Stopping the infinite loop for demonstration purposes.");
                break;
            }
        }
    }
}
```
### Explanation
- ***Initialization***: The variable `counter` is initialized to `0`.
- ***Infinite Loop Condition***: The `while (true)` statement creates an infinite loop because `true` is always true.
- ***Loop Execution***: Inside the loop, the current value of `counter` is printed, and `counter` is incremented.
- ***Breaking the Loop***: Although the loop is designed to run infinitely, a `break` statement is used to exit the loop after 10 iterations for demonstration purposes.

### Key Points
- ***Infinite Loop***: A loop that never terminates on its own because its condition always evaluates to true.
- ***Use Cases***: Commonly used in scenarios where a task needs to run continuously until externally stopped, such as server applications or event listeners.
- ***Caution***: Infinite loops can cause a program to become unresponsive or consume excessive resources if not managed properly. It's important to have a termination condition or a way to exit the loop when needed.

### Summary
- ***Infinite Loop***: Created when a loop's termination condition is never met, causing it to run indefinitely.
- ***Example Code***: Demonstrates an infinite loop using `while (true)` and breaks it after 10 iterations for demonstration purposes.