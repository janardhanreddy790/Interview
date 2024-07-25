# Difference between `==` and `.equals()` in Java

In Java, `==` and `.equals()` are used to compare objects, but they serve different purposes and have different meanings.

### Key Differences:

1. **`==` Operator**:
    - **Purpose**: Compares references, not values.
    - **Usage**: Used to check if two references point to the same object in memory.
    - **Example**:
      ```java
      String str1 = "Hello";
      String str2 = "Hello";
      String str3 = new String("Hello");
 
      System.out.println(str1 == str2); // true, because both refer to the same object in the string pool
      System.out.println(str1 == str3); // false, because str3 is a new object
      ```

2. **`.equals()` Method**:
    - **Purpose**: Compares values/content of objects.
    - **Usage**: Used to check if two objects are logically "equal".
    - **Example**:
      ```java
      String str1 = "Hello";
      String str2 = "Hello";
      String str3 = new String("Hello");
 
      System.out.println(str1.equals(str2)); // true, because the content is the same
      System.out.println(str1.equals(str3)); // true, because the content is the same
      ```

### Example: EqualityExample.java

This example demonstrates the difference between `==` and `.equals()` when comparing strings in Java.

```java
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
```

### Explanation
- ***`==` Operator***: Used to compare the reference addresses of objects. In the example, `str1` and `str2` point to the same object in the string pool, so `str1 == str2 is true`. However, `str1 == str3 is false` because `str3` is a new object.
- ***`.equals()` Method:***: Used to compare the contents of objects. In the example, `str1.equals(str2)` and `str1.equals(str3)` are both true because the content of the strings is the same.


### Summary

- ***`==` Operator***: Compares references (memory addresses).
- ***`.equals()` Method:***: Compares values (contents).
- 
