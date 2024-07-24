package com.nagam.interview.example.java.oops.OOPConcepts;

// Inheritance Example
class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}