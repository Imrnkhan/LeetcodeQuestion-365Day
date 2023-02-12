package LinklistQuestion;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedlist {


    // 1 2 3 4 5
    public class ListNode {

        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {

        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            while (head != null) {
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }
            return prev;
        }
    }
}








//        LinkedList<Integer> hs = new LinkedList<>();
//        hs.add(1);
//        hs.add(2);
//        hs.add(3);
//        hs.add(4);
//        hs.add(5);
//
//        Collections.reverse(hs);
//
//        System.out.println(hs);
//    }
//}




//main code




/*
Given the head of a singly linked list, reverse the list, and return the reversed list.



Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
 */