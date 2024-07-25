# How to Nest Loops in Java

Nesting loops in Java means placing one loop inside another loop. The outer loop controls the number of complete executions of the inner loop. This technique is useful for tasks that require a multi-dimensional iteration, such as iterating over a matrix or creating patterns.

### Example: NestedLoopExample.java

This example demonstrates how to nest a `for` loop inside another `for` loop.

```java
package com.nagam.interview.example.java.loops;

public class NestedLoopExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration: " + i);
            
            for (int j = 1; j <= 2; j++) {
                System.out.println("  Inner loop iteration: " + j);
            }
        }
    }
}
```

### Explanation
- ***Outer Loop***: The outer loop runs from `1` to `3`, controlling the number of times the inner loop will execute.
- ***Inner Loop***: For each iteration of the outer loop, the inner loop runs from `1` to `2`. This means the inner loop will execute completely for each iteration of the outer loop.
- ***Output***: The outer loop's current iteration is printed, followed by the inner loop's iterations, creating a nested structure in the output.

### Key Points
- ***Control Flow***: The outer loop runs first, and for each iteration of the outer loop, the inner loop runs completely.
- ***Use Cases***: Useful for tasks that involve multi-dimensional data structures (e.g., matrices), creating patterns, or performing repetitive operations within a repetitive operation.

### Use Cases
- Iterating over two-dimensional arrays or matrices.
- Generating complex patterns or structures.
- Performing nested repetitive tasks.

### Summary
- ***Nested Loops***: Placing one loop inside another to handle multi-dimensional iteration.
- ***Example Code***: Demonstrates nested `for` loops to print iterations of both loops.