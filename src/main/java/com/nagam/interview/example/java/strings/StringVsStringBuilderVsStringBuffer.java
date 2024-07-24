package com.nagam.interview.example.java.strings;

/**
 * This class demonstrates the differences between String, StringBuilder, and StringBuffer in Java.
 * It includes examples to show how each class behaves with string manipulation.
 */
public class StringVsStringBuilderVsStringBuffer {
    public static void main(String[] args) {
        // Example with String
        String str = "Hello";
        str = str.concat(" World"); // Creates a new String object
        System.out.println("String: " + str);

        // Example with StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Modifies the existing StringBuilder object
        System.out.println("StringBuilder: " + sb.toString());

        // Example with StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World"); // Modifies the existing StringBuffer object
        System.out.println("StringBuffer: " + sbf.toString());
    }
}