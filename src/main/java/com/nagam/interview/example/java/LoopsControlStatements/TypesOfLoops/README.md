# Types of Loops in Java

Loops are used in programming to repeat a block of code as long as a specified condition is met. Java supports several types of loops, each designed for different use cases.

### Types of Loops

1. **For Loop**
2. **While Loop**
3. **Do-While Loop**
4. **Enhanced For Loop (for-each)**

### For Loop

The for loop is used when the number of iterations is known beforehand. It consists of three parts: initialization, condition, and increment/decrement.

```java
System.out.println("For Loop:");
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
```

### While Loop

The while loop is used when the number of iterations is not known beforehand. It continues as long as the specified condition is true.

```java
System.out.println("\nWhile Loop:");
int count = 0;
while (count < 5) {
        System.out.println("Iteration: " + count);
count++;
}
```

### Do-While Loop

The do-while loop is similar to the while loop, but it guarantees that the loop body will be executed at least once, as the condition is evaluated after the loop body.

```java
System.out.println("\nDo-While Loop:");
int number = 0;
do {
        System.out.println("Iteration: " + number);
number++;
} while (number < 5);
```

### Enhanced For Loop (for-each)

The enhanced for loop, also known as the for-each loop, is used to iterate over arrays or collections. It is more readable and eliminates the need for a counter variable.

```java
System.out.println("\nEnhanced For Loop:");
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
        System.out.println("Number: " + num);
}
```


### Example: LoopExamples.java

The LoopExamples.java file demonstrates all four types of loops in Java.

```java
package com.nagam.interview.example.java.LoopsControlStatements.TypesOfLoops;

public class LoopExamples {

    public static void main(String[] args) {
        // 1. For Loop
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // 2. While Loop
        System.out.println("\nWhile Loop:");
        int count = 0;
        while (count < 5) {
            System.out.println("Iteration: " + count);
            count++;
        }

        // 3. Do-While Loop
        System.out.println("\nDo-While Loop:");
        int number = 0;
        do {
            System.out.println("Iteration: " + number);
            number++;
        } while (number < 5);

        // 4. Enhanced For Loop (for-each)
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}
```

### Summary

- ***For Loop***: Ideal when the number of iterations is known.
- ***While Loop***: Suitable when the number of iterations is not known and depends on a condition.
- ***Do-While Loop***: Ensures the loop body is executed at least once.
- ***Enhanced For Loop (for-each)***: Best for iterating over arrays or collections in a readable way.
