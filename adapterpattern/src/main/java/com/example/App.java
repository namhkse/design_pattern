package com.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Create a Vector to hold some elements
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        Iterator it = fruits.iterator();
        Enumeration enumeration = new EnumerationAdapter(it);

        // Iterate over the elements using the Enumeration
        while (enumeration.hasMoreElements()) {
            String element = (String)enumeration.nextElement();
            System.out.println(element);
        }
    }
}
