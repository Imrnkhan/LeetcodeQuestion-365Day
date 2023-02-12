package LinklistQuestion;

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class CreateLinkedList {
        public static void main(String[] args) {
            // Create the linked list 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            // Print the linked list
            ListNode curr = head;
            while (curr != null) {
                System.out.print(curr.val + " ");
                curr = curr.next;
            }
        }
    }

// another way


/*
import java.util.LinkedList;

public class CreateLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the linked list
        for (int val : list) {
            System.out.print(val + " ");
        }
    }
}


 */
