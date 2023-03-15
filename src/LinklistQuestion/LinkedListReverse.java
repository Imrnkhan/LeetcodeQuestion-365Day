package LinklistQuestion;


public class LinkedListReverse {

//    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//
//        head = reverseList(head);
//
//        ListNode current = head;
//        while (current != null) {
//            System.out.print(current.val + " ");
//            current = current.next;
//
//    }
//
//}
//


   // when using big number reverse

public static void main(String[] args) {
    ListNode head = new ListNode(1);
    ListNode current = head;
    for (int i = 2; i <= 10; i++) {
        current.next = new ListNode(i);
        current = current.next;
    }

    head = reverseList(head);

    current = head;
    while (current != null) {
        System.out.print(current.val + " ");
        current = current.next;
    }
}




    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int val) {
//        this.val = val;
//    }
//}
//
