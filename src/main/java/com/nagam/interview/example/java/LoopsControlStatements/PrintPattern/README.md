# Provide an Example to Print a Certain Pattern in Java Using Loops

Printing patterns is a common task in Java programming, often used to understand and practice nested loops. This example demonstrates how to print a simple right-angled triangle pattern using nested loops.

### Example: PatternPrintingExample.java

This example shows how to print a right-angled triangle pattern using nested `for` loops.

```java
package com.nagam.interview.example.java.loops;

public class PatternPrintingExample {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

### Explanation
- ***Outer Loop***: The outer loop runs from `1` to `rows` (5 in this case). It controls the number of rows in the pattern.
- ***Inner Loop***: The inner loop runs from `1` to `i`, where `i` is the current row number. It controls the number of stars (`*`) printed in each row.
- ***Print Statement***: `System.out.print("* ");` prints a star followed by a space without moving to a new line.
- ***New Line***: `System.out.print();` moves the cursor to the next line after printing all the stars in the current row.

### OUTPUT

```java
* 
* * 
* * * 
* * * * 
* * * * *
```

### Key Points
1. ***Nested Loops***: Used to print a pattern where the number of elements in each row varies.
2. ***Pattern Logic***: The inner loop runs up to the current row number to print the required number of stars.

### Use Cases
- Creating various patterns for learning and testing loop constructs.
- Generating simple shapes or structures in console applications.

### Summary
- ***Pattern Printing***: Demonstrates how to use nested loops to print a right-angled triangle pattern.
- ***Example Code***: Prints a triangle pattern with stars using nested for loops.