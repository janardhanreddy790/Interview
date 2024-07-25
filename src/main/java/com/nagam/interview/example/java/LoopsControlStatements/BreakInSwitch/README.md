# How Does the Break Statement Work in a Switch Case?

In Java, the `switch` statement is used to execute one statement from multiple conditions. The `break` statement is crucial within a `switch` statement because it terminates a case in the `switch` block. If the `break` statement is omitted, execution will continue to the next case, which is usually undesirable.

### Example: BreakInSwitchExample.java

This example demonstrates how the `break` statement works in a `switch` case.

```java
package com.nagam.interview.example.java.LoopsControlStatements.BreakInSwitch;

public class BreakInSwitchExample {

    public static void main(String[] args) {
        int day = 3;

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
The break statement is used to exit from the current switch case. Without the break, the program will continue to execute the subsequent cases until it encounters a break or the end of the switch block.

- Syntax
    ```java
    switch (variable) {
    case value1:
        // code to be executed if variable == value1
        break;
    case value2:
        // code to be executed if variable == value2
        break;
    // more cases...
    default:
        // code to be executed if variable doesn't match any case
        break;
    }
  ```

### Example Explanation

- ***Variable***: The variable `day` is an integer that holds the value 3.
- ***Switch Statement***: The `switch` statement evaluates the value of `day`.
- ***Case Blocks***: Each `case` block corresponds to a `day` of the week. When day matches 3, the block `case 3:` is executed, printing "Wednesday" to the console, followed by a break to exit the `switch` statement.
- ***Default Block***: If `day` does not match any of the cases, the `default` block will execute, printing "Invalid day."

### Summary
- ***Break Statement***: Terminates the current `switch` case to prevent fall-through to subsequent cases.
- ***Case Blocks***: Define the possible values for the variable and the corresponding actions.
- ***Default Block***: Executes if no case matches the variable.