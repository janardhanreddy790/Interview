# Difference between String, StringBuilder, and StringBuffer

In Java, `String`, `StringBuilder`, and `StringBuffer` are used for handling text. Here’s a breakdown of their differences:

## 1. `String`

- **Immutability:** `String` objects are immutable. Once a `String` object is created, it cannot be changed. Any modification creates a new `String` object.
- **Performance:** Due to its immutability, operations on `String` can be slower when performing many modifications because each operation creates a new `String` object.
- **Usage:** Use `String` when you have a fixed set of text and do not need to modify it frequently.

**Example:**

```java
String str = "Hello";
str = str.concat(" World"); // Creates a new String object
System.out.println("String: " + str);
```


## 2. `StringBuilder`

- **Mutability:** `StringBuilder` objects are mutable. You can modify the content of a StringBuilder object without creating a new object.
- **Performance:** `StringBuilder` is more efficient than String for frequent modifications because it does not create a new object for each modification.
- **Usage:** Use `StringBuilder` when you need to perform many modifications to a string and thread safety is not a concern.

**Example:**

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World"); // Modifies the existing StringBuilder object
System.out.println("StringBuilder: " + sb.toString());
```


## 3. `StringBuffer`

- **Mutability:** Like `StringBuilder` `StringBuffer` objects are mutable. You can modify the content of a StringBuffer object without creating a new object.
- **Synchronization:** `StringBuffer`  is synchronized, meaning it is thread-safe. This adds a slight overhead compared to `StringBuilder`.
- **Usage:** Use `StringBuffer` when you need a mutable string and thread safety is required.

**Example:**

```java
StringBuffer sbf = new StringBuffer("Hello");
sbf.append(" World"); // Modifies the existing StringBuffer object
System.out.println("StringBuffer: " + sbf.toString());
```


### Summary

- ***String***:
  - Immutable
  - Slower performance for frequent modifications
  - Use for fixed text

- ***StringBuilder***:
  - Mutable
  - Faster performance for frequent modifications
  - Not synchronized
  - Use when thread safety is not needed

- ***StringBuffer***:
  - Mutable
  - Similar performance to StringBuilder, but synchronized
  - Use when thread safety is needed
