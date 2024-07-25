# Can You Use an if-else Statement Inside a Ternary Operation?

In Java, the ternary operator (`? :`) is a shorthand for `if-else` statements. While you cannot directly use `if-else` statements within a ternary operation, you can nest ternary operations to achieve a similar result.

### Example: TernaryWithIfElseExample.java

This example demonstrates how to use nested ternary operations to mimic an `if-else` statement inside a ternary operation.

```java
package com.nagam.interview.example.java.LoopsControlStatements.IfElseInTernary;

public class TernaryWithIfElseExample {

    public static void main(String[] args) {
        int number = 15;

        String result = (number % 2 == 0) ? "Even" : (number % 3 == 0) ? "Divisible by 3" : "Odd";
        
        System.out.println("The number is: " + result);
    }
}
```
### Explanation
The ternary operator allows you to make a concise conditional assignment. In this example, nested ternary operations are used to check multiple conditions.

- Syntax:
  ```java
      condition ? value_if_true : value_if_false
  ```

### Example Explanation

- ***Variable***: The variable `number` holds the integer value 15.
- ***Ternary Operation***: The outer ternary operation checks if `number` is even (`number % 2 == 0`).
- ***Nested Ternary***: If `number` is not even, the inner ternary checks if `number` is divisible by 3 (`number % 3 == 0`).
- ***Final Condition***: If neither condition is met, it assigns "Odd" to the result.

The result is then printed to the console, displaying "Divisible by 3" because 15 is not even but is divisible by 3.

### Summary

- ***Ternary Operator***: A shorthand for `if-else` statements.
- ***Nested Ternary Operations***: Can be used to check multiple conditions.
- ***Example Code***: Demonstrates how to nest ternary operations to evaluate multiple conditions.
