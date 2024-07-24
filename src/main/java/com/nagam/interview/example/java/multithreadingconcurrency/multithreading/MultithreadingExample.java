package com.nagam.interview.example.java.multithreadingconcurrency.multithreading;

/**
 * This class demonstrates the concept of multithreading in Java.
 * It includes examples of creating and running threads.
 */
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