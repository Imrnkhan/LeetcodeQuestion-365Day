package Coding_Question;
import java.util.*;

class MyHashSet {
    // declare a HashSet to store the keys
    Set<Integer> set;

    /** Initialize your data structure here. */
    public void MyHashSetImplemantion5() {
        // initialize the HashSet in the constructor
        set = new HashSet<>();
    }

    public void add(int key) {
        // add the key to the HashSet
        set.add(key);
    }

    public void remove(int key) {
        // remove the key from the HashSet
        set.remove(key);
    }

    public boolean contains(int key) {
        // check if the HashSet contains the key
        return set.contains(key);
    }
}

public class Main {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add\n2. Remove\n3. Contains\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the key to add: ");
                int key = scanner.nextInt();
                myHashSet.add(key);
                System.out.println("Key added successfully.");
            } else if (choice == 2) {
                System.out.print("Enter the key to remove: ");
                int key = scanner.nextInt();
                myHashSet.remove(key);
                System.out.println("Key removed successfully.");
            } else if (choice == 3) {
                System.out.print("Enter the key to check: ");
                int key = scanner.nextInt();
                boolean contains = myHashSet.contains(key);
                System.out.println("Contains: " + contains);
            } else if (choice == 4) {
                break;
            }
        }

    }
}



/*
705. Design HashSet
Easy
2.6K
236
Companies
Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.


Example 1:

Input
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
Output
[null, null, null, true, false, null, true, null, false]

Explanation
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)
 */