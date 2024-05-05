package Leetcode;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateCharacter {


        public static void main(String[] args) {
            String str = "imrankhan";

            // Create a LinkedHashSet to store the duplicate characters
            Set<Character> duplicates = new LinkedHashSet<>();

            // Create a LinkedHashSet to store the unique characters
            Set<Character> uniques = new LinkedHashSet<>();

            // Loop through the characters in the string and add them to the unique set if they haven't been seen before
            // or to the duplicate set if they have
            for (int i =0;i<str.length();i++) {
                if (!uniques.add(str.charAt(i))) {
                    duplicates.add(str.charAt(i));
                }
            }

            // Print out the duplicate characters
            for (Character c : duplicates) {
                System.out.print(c );
            }
        }
    }


