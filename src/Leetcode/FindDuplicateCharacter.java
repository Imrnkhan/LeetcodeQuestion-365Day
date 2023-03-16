package Leetcode;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateCharacter {


        public static void main(String[] args) {
            String str = "hello world";

            // Create a LinkedHashSet to store the duplicate characters
            Set<Character> duplicates = new LinkedHashSet<>();

            // Create a LinkedHashSet to store the unique characters
            Set<Character> uniques = new LinkedHashSet<>();

            // Loop through the characters in the string and add them to the unique set if they haven't been seen before
            // or to the duplicate set if they have
            for (char c : str.toCharArray()) {
                if (!uniques.add(c)) {
                    duplicates.add(c);
                }
            }

            // Print out the duplicate characters
            System.out.print("Duplicate characters: ");
            for (Character c : duplicates) {
                System.out.print(c + " ");
            }
        }
    }


