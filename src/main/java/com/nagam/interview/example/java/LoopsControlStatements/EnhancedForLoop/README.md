# Enhanced For Loop in Java

The enhanced for loop, also known as the "for-each" loop, is used to iterate over arrays or collections in Java. It simplifies the code by eliminating the need for an explicit iterator or index variable.

### Syntax

```java
for (type variable : collection) {
    // code to be executed
}
```

### Example: EnhancedForLoopExample.java

This example demonstrates the use of an enhanced for loop to iterate over an array of integers and print each element.


```java
package com.nagam.interview.example.java.LoopsControlStatements.EnhancedForLoop;

public class EnhancedForLoopExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Enhanced For Loop:");
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}

```

### Explanation
- ***Array Declaration***: An array of integers numbers is initialized with values `{1, 2, 3, 4, 5}`.
- ***Enhanced For Loop***: The loop iterates over each element in the `numbers` array. For each iteration, the current element is assigned to the variable `number`, which is then printed to the console.

### Key Points
- ***Simplicity***: The enhanced for loop simplifies the iteration process by abstracting the iterator or index management.
- ***Readability***: It makes the code more readable and concise, especially when iterating over arrays or collections.
- ***Type-Safety***: Ensures that each element in the collection is of the specified type.

### Use Cases
- Iterating over arrays or collections (like `List`, `Set`, etc.).
- Suitable when you need to access each element without modifying the underlying collection.

### Summary
- ***Enhanced For Loop***: A simpler and more readable way to iterate over arrays and collections.
- ***Example Code***: Demonstrates iterating over an array of integers and printing each element using an enhanced for loop.