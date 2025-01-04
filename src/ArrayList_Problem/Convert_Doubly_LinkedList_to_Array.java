package ArrayList_Problem;

import java.util.ArrayList;
import java.util.List;

//public class Convert_Doubly_LinkedList_to_Array Node {
    class Node {
        public int val;
        public Node prev;
        public Node next;
    public int[] printListInOrder(Node head) {
        // Initialize an ArrayList to store node values
        List<Integer> resultList = new ArrayList<>();

        // Traverse the doubly linked list starting from the head
        while (head != null) {
            resultList.add(head.val); // Add the value of the current node
            head = head.next;         // Move to the next node
        }

        // Convert ArrayList to int[] array and return it
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i); // Copy values into the result array
        }

        return result; // Return the final array of node values
    }


}
