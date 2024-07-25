package com.nagam.interview.example.java.LoopsControlStatements.ConditionalStatements;

public class ConditionalStatementsExample {

    public static void main(String[] args) {
        int number = 10;

        // if statement
        if (number > 0) {
            System.out.println("if statement:");
            System.out.println("The number is positive.");
            System.out.println("---***---");
        }

        // if-else statement
        if (number < 0) {
            System.out.println("if-else statement:");
            System.out.println("The number is negative.");
            System.out.println("---***---");
        } else {
            System.out.println("if-else statement:");
            System.out.println("The number is non-negative.");
            System.out.println("---***---");
        }

        // if-else-if ladder
        if (number < 0) {
            System.out.println("if-else-if ladder:");
            System.out.println("The number is negative.");
            System.out.println("---***---");
        } else if (number == 0) {
            System.out.println("if-else-if ladder:");
            System.out.println("The number is zero.");
            System.out.println("---***---");
        } else {
            System.out.println("if-else-if ladder:");
            System.out.println("The number is positive.");
            System.out.println("---***---");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("switch statement:");
                System.out.println("Wednesday");
                System.out.println("---***---");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
    }
}