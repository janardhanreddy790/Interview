# Explain the Java Collections Framework

The Java Collections Framework (JCF) provides a set of interfaces and classes for storing and manipulating groups of data. It is a unified architecture for representing and manipulating collections, enabling the developer to work with different types of collections using a consistent API.

## Key Components of Java Collections Framework

1. **Collections Interfaces:**
    - **Collection:** The root interface in the collection hierarchy.
    - **List:** An ordered collection (sequence) that can contain duplicate elements. Examples: `ArrayList`, `LinkedList`.
    - **Set:** A collection that does not allow duplicate elements. Examples: `HashSet`, `LinkedHashSet`.
    - **Map:** An object that maps keys to values. It does not allow duplicate keys. Examples: `HashMap`, `TreeMap`.

2. **Implementing Classes:**
    - **ArrayList:** Implements the `List` interface. Provides a resizable array implementation.
    - **LinkedList:** Implements the `List` interface. Provides a doubly-linked list implementation.
    - **HashSet:** Implements the `Set` interface. Uses a hash table for storage and does not maintain any order.
    - **LinkedHashSet:** Extends `HashSet` and maintains insertion order.
    - **HashMap:** Implements the `Map` interface. Uses a hash table to store key-value pairs.
    - **TreeMap:** Implements the `Map` interface. Provides a sorted map.

3. **Common Methods:**
    - **List:**
        - `add(E e)`: Adds an element to the list.
        - `get(int index)`: Retrieves the element at the specified position.
        - `remove(Object o)`: Removes the first occurrence of the specified element.
    - **Set:**
        - `add(E e)`: Adds an element to the set.
        - `remove(Object o)`: Removes the specified element.
        - `contains(Object o)`: Checks if the set contains the specified element.
    - **Map:**
        - `put(K key, V value)`: Associates the specified value with the specified key.
        - `get(Object key)`: Retrieves the value associated with the specified key.
        - `remove(Object key)`: Removes the mapping for the specified key.

## Example Code

Here’s a simple example demonstrating the usage of `List`, `Set`, and `Map`:

```java
package com.nagam.interview.example.java.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class CollectionsFrameworkExample {
    public static void main(String[] args) {
        // Example with List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List: " + list);

        // Example with Set
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate value
        System.out.println("Set: " + set);

        // Example with Map
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        System.out.println("Map: " + map);
    }
}
```


### Explanation
- ***List***: The `ArrayList` class provides a dynamic array implementation. It allows duplicate elements and maintains the insertion order.
- ***Set***: The `HashSet` class implements the `Set` interface and does not allow duplicate elements. It does not maintain any order.
- ***Map***: The `HashMap` class stores key-value pairs. Keys are unique, and values are associated with each key.

In the ObjectExample class, we create an instance of the Car class, use its methods to get and update the car's details, and display these details to the console.

### Summary

- ***List***: Ordered collection that allows duplicates. Examples: `ArrayList`, `LinkedList` .
- ***Set***: Collection that does not allow duplicates. Examples: `HashSet`, `LinkedHashSet` .
- ***Map***: Collection that maps keys to values. Keys are unique. Examples: `HashMap`, `TreeMap` .

