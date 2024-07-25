# How Does a Switch Condition Work with String in Java?

In Java, the `switch` statement can be used with strings, starting from Java 7. This allows for more readable and maintainable code when you need to perform different actions based on the value of a string.

### Example: SwitchWithStringExample.java

This example demonstrates how to use a `switch` statement with strings in Java.

```java
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
```

### Explanation
The `switch` statement evaluates its expression, in this `case`, a string, and executes the corresponding case block that matches the string value. If no matching case is found, the `default` block is executed.

- Syntax
  - ```java
    switch (stringVariable) {
      case "value1":
          // code to be executed if stringVariable equals value1
          break;
      case "value2":
          // code to be executed if stringVariable equals value2
          break;
      // more cases...
      default:
          // code to be executed if stringVariable doesn't match any case
          break;
    }
    ```

### Example Explanation
- ***Variable***: The variable `day` is a string that holds the value "Wednesday".
- ***Switch Statement***: The switch statement evaluates the value of `day`.
- ***Case Blocks***: Each `case` block corresponds to a day of the week. When day matches "Wednesday", the block `case "Wednesday": is executed, printing "Midweek day." to the console.
- ***Default Block***: If `day` does not match any of the cases, the `default` block will execute, printing "Invalid day."


### Summary
- ***Switch Statement***: Can be used with strings starting from Java 7.
- ***Case Blocks***: Each `case` block contains code to be executed when the string variable matches the case.
- ***Default Block***: Executes if no case matches the string variable.
