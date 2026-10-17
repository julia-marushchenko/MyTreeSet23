/**
 *  Java program to create, read, update, and delete TreeSet instance.
 */

package com.mycollections;

import java.util.Set;
import java.util.TreeSet;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Set<Character> myTreeSet = new TreeSet<>();

        // Add.
        myTreeSet.add('c');
        myTreeSet.add('d');
        myTreeSet.add('w');
        myTreeSet.add('f');
        myTreeSet.add('s');
        myTreeSet.add('h');
        myTreeSet.add('l');

        System.out.println("Set before update:");

        // Read.
        myTreeSet.stream().forEach(System.out::println);

        // Update.
        myTreeSet.add('k');
        myTreeSet.add('a');
        myTreeSet.add('j');
        myTreeSet.add('k');

        System.out.println("Set after update:");
        // Read.
        myTreeSet.stream().forEach(System.out::println);

        // Delete.
        myTreeSet.clear();

    }
}