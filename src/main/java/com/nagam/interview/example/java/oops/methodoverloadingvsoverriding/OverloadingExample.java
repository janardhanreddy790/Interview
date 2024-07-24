package com.nagam.interview.example.java.oops.methodoverloadingvsoverriding;

class OverloadingExample {
    // Method overloading - two methods with the same name but different parameters
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}