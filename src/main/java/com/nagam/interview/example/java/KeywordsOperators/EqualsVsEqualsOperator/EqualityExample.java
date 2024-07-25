package com.nagam.interview.example.java.KeywordsOperators.EqualsVsEqualsOperator;

public class EqualityExample {
    public static void main(String[] args) {
        // Using ==
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        // Comparing references
        System.out.println("Using == operator:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true, because both point to the same memory location in the string pool
        System.out.println("str1 == str3: " + (str1 == str3)); // false, because str3 is a new object

        // Using .equals()
        System.out.println("\nUsing .equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true, because .equals() compares the content
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true, because .equals() compares the content
    }
}
