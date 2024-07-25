package com.nagam.interview.example.java.LoopsControlStatements.SwitchWithString;

public class SwitchWithStringExample {

    public static void main(String[] args) {
        String day = "Wednesday";

        switch (day) {
            case "Monday":
                System.out.println("Start of the work week.");
                break;
            case "Tuesday":
                System.out.println("Second day of the work week.");
                break;
            case "Wednesday":
                System.out.println("Midweek day.");
                break;
            case "Thursday":
                System.out.println("Almost the end of the work week.");
                break;
            case "Friday":
                System.out.println("Last day of the work week.");
                break;
            case "Saturday":
                System.out.println("Weekend begins.");
                break;
            case "Sunday":
                System.out.println("Weekend ends.");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
    }
}