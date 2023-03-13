package Coding_Question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.ArrayList;
import java.util.Scanner;

class MyHashSet {

    // declare an ArrayList to store the keys
    ArrayList<Integer> list;

    /** Initialize your data structure here. */
    public MyHashSet() {
        // initialize the ArrayList in the constructor
        list = new ArrayList<>();
    }

    public void add(int key) {
        // add the key to the end of the ArrayList
        list.add(key);
    }

    public void remove(int key) {
        // check if the ArrayList contains the key
        if (list.contains(key)) {
            // if it does, create a new ArrayList containing only the key to be removed
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(key);
            // use the removeAll method to remove all occurrences of the key from the original ArrayList
            list.removeAll(list2);
        }
    }

    public boolean contains(int key) {
        // check if the ArrayList contains the key
        return list.contains(key);
    }

    public static void main(String[] args) {

        // create a new MyHashSet object
        MyHashSet set = new MyHashSet();
//        String[] arr = {"MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"};

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