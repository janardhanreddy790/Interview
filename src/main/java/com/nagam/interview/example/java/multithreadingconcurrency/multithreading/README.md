# What is Multithreading in Java?

## Overview

Multithreading in Java is a concurrent execution of two or more threads. A thread is a lightweight process, and multithreading is used to perform multiple tasks simultaneously. Java provides built-in support for multithreading through the `Thread` class and the `Runnable` interface.

## Key Concepts

- **Thread:** A thread is a single path of execution in a program. Java allows you to create and manage threads.
- **Concurrency:** Multithreading is a form of concurrency where multiple threads run in parallel.
- **Synchronization:** When multiple threads access shared resources, synchronization is needed to avoid data inconsistency.

## Creating Threads

In Java, there are two main ways to create a thread:

1. **Extending the `Thread` class:**
    - Create a new class that extends `Thread`.
    - Override the `run` method to define the code executed by the thread.
    - Create an instance of the class and call `start()` to begin execution.

2. **Implementing the `Runnable` interface:**
    - Create a class that implements the `Runnable` interface.
    - Override the `run` method to define the code executed by the thread.
    - Create a `Thread` object, passing an instance of the `Runnable` class, and call `start()` to begin execution.

## Example

Here’s a simple example demonstrating both methods of creating threads:

```java
package com.nagam.interview.example.java.multithreadingconcurrency.multithreading;

public class MultithreadingExample {
    public static void main(String[] args) {
        // Creating threads using Thread class
        Thread thread1 = new MyThread();
        thread1.start();

        // Creating threads using Runnable interface
        Runnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
```

```java
// Creating a thread by extending the Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread from MyThread class: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
```

```java

// Creating a thread by implementing the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread from MyRunnable class: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
```

### Explanation
- ***'MyThread' Class***: Demonstrates creating a thread by extending the Thread class. The run method is overridden to define the task performed by the thread.
- ***'MyRunnable' Class***: Demonstrates creating a thread by implementing the Runnable interface. The run method is overridden, and an instance of MyRunnable is passed to a Thread object.
- ***'Thread.sleep(500);'***: is used to pause the thread for 500 milliseconds to simulate some processing time.


### Summary

- ***Multithreading***: Enables concurrent execution of multiple threads, allowing a program to perform multiple tasks simultaneously.
- ***Thread Creation***: Can be achieved by either extending the Thread class or implementing the Runnable interface.
- ***Synchronization***: Essential for managing access to shared resources to ensure data consistency.


