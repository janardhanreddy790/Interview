# How Does the Default Case Work in Java?

In Java, the `default` case in a `switch` statement provides a fallback option when none of the `case` labels match the value of the `switch` expression. It is an optional case but highly useful for handling unexpected values and ensuring robust code.

### Example: DefaultCaseExample.java

This example demonstrates how the `default` case works in a `switch` statement.

```java
package com.nagam.interview.example.java.LoopsControlStatements.DefaultCase;

public class DefaultCaseExample {

    public static void main(String[] args) {
        int day = 8;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
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
                System.out.println("Invalid day");
                break;
        }
    }
}

```
### Explanation

The `default` case is used to execute a block of code if none of the `case` labels match the `switch` expression. It is similar to the "else" part of an "if-else" chain.

- Syntax
  - ```java
    switch (variable) {
        case value1:
        // code to execute if variable == value1
        break;
        case value2:
        // code to execute if variable == value2
        break;
        // more cases...
        default:
        // code to execute if no case matches
        break;
    }
    ```

### Example Explanation
- ***Variable***: The variable `day` holds the value 8.
- ***Switch Statement***: The `switch` statement evaluates the value of `day`.
- ***Case Blocks***: Each `case` block corresponds to a `day` of the week. Since day is 8, which does not match any of the defined cases (1 through 7), the default block is executed.
- ***Default Block***: The `default` block prints "Invalid day" to the console. This block executes only when no other `case` matches the value of the `switch` expression.

### Summary
- ***Default Case***: Provides a fallback option for unmatched `case` values.
- ***Execution***: Executes if none of the case labels match the `switch` expression.
- ***Use***: Ensures that there is a defined action for unexpected or invalid values.