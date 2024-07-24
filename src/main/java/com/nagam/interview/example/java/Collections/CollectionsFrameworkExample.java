package com.nagam.interview.example.java.Collections;

import java.util.*;

/**
 * This class demonstrates the Java Collections Framework.
 * It includes examples of common collection types: List, Set, and Map.
 */
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