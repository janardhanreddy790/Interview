# Difference between a For Loop and a While Loop

Both `for` and `while` loops are control flow statements used to repeat a block of code, but they have different use cases and structures. Understanding the differences between them is crucial for writing efficient and readable code.

### For Loop

A `for` loop is typically used when the number of iterations is known beforehand. It consists of three parts: initialization, condition, and increment/decrement. This makes it ideal for iterating a specific number of times.

```java
System.out.println("For Loop:");
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
```
- ***Initialization***: Executed once at the beginning.
- ***Condition***: Evaluated before each iteration; if false, the loop ends.
- ***Increment/Decrement***: Executed after each iteration.


### While Loop

A `while` loop is used when the number of iterations is not known beforehand and depends on a condition. It checks the condition before each iteration, and the loop continues as long as the condition is true.

```java
System.out.println("\nWhile Loop:");
int count = 0;
while (count < 5) {
        System.out.println("Iteration: " + count);
count++;
}
```

- ***Initialization***: Typically done before the loop starts.
- ***Condition***: Evaluated before each iteration; if false, the loop ends.
- ***Increment/Decrement***: Executed inside the loop body.

### Key Differences

1. ***Use Case***:
   - ***For Loop***: Used when the number of iterations is known.
   - ***While Loop***: Used when the number of iterations is unknown and depends on a condition.

2. ***Structure***:
   - ***For Loop***: Combines initialization, condition, and increment/decrement in one line.
   - ***While Loop***: Initialization is separate, and increment/decrement is inside the loop body.

3. ***Readability***:
   - ***For Loop***: More concise and easier to read when the loop count is known.
   - ***While Loop***: More flexible when the loop depends on a condition that changes in complex ways.

### Example: ForLoopVsWhileLoop.java

The `ForLoopVsWhileLoop.java` file demonstrates both a `for` loop and a `while` loop for iterating five times.

```java
package com.nagam.interview.example.java.LoopsControlStatements.ForVsWhileLoop;

public class ForLoopVsWhileLoop {

    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int count = 0;
        while (count < 5) {
            System.out.println("Iteration: " + count);
            count++;
        }
    }
}

```

### Summary

- ***For Loop***: Ideal for a known number of iterations with a concise structure.
- ***While Loop***: Suitable for unknown iterations based on a condition.


