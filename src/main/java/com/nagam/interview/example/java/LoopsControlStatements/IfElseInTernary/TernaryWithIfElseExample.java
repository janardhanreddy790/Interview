package com.nagam.interview.example.java.LoopsControlStatements.IfElseInTernary;

public class TernaryWithIfElseExample {

    public static void main(String[] args) {
        int number = 15;

        String result = (number % 2 == 0) ? "Even" : (number % 3 == 0) ? "Divisible by 3" : "Odd";
        
        System.out.println("The number is: " + result);
    }
}