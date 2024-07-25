# Difference between for-each loop and Iterator in Java

Java provides multiple ways to iterate over collections. Two common methods are using a for-each loop and using an Iterator. Each has its own use cases and advantages.

### Example: ForEachVsIteratorExample.java

This example demonstrates the usage of both a for-each loop and an Iterator to iterate over a list of strings.

```java
package com.nagam.interview.example.java.LoopsControlStatements.ForeachVsIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachVsIteratorExample {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Using for-each loop
        System.out.println("Using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

```


### Explanation
***For-Each Loop***

- ***Syntax***: `for (Type item : collection) { ... }`
- ***Usage***: Simple and concise way to iterate over a collection.
- ***Advantages***:
  - Easy to read and write.
  - No explicit handling of indices or iterators.
- ***Limitations***:
  - Cannot remove elements during iteration.
  - Limited control over the iteration process (e.g., skipping elements).

***Iterator***

- Syntax:

    ```java
    Iterator<Type> iterator = collection.iterator();
    while (iterator.hasNext()) {
        Type item = iterator.next();
        ...
    }
    ```
  - ***Usage***: Provides more control over the iteration process.
  
  - ***Advantages***:
    - Can remove elements during iteration using iterator.remove().
    - More control over the iteration process.
    
  - ***Limitations***:
    - More verbose compared to for-each loop.
    - Requires understanding of the Iterator interface.
  - ***OUTPUT***:
  - ```java
    Using for-each loop:
    Apple
    Banana
    Cherry
    
    Using Iterator:
    Apple
    Banana
    Cherry
    
    ```

### Key Points
- ***For-Each Loop***: Simpler syntax, easy to read and write, but less control over the iteration process.
- ***Iterator***: More control over iteration, allows removal of elements, but more verbose.

### Use Cases
- ***For-Each Loop***: Use when you need a simple and readable way to iterate over a collection without modifying it.
- ***Iterator***: Use when you need more control over the iteration process or need to remove elements during iteration.

### Summary
- ***For-Each Loop***: Simplified and concise iteration.
- ***Iterator***: Provides more control and flexibility during iteration.