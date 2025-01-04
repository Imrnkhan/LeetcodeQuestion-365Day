package ArrayList_Problem;


class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ArrayToLinkedList {

    public static ListNode arrayToLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        // Create the head node of the list
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        // Iterate over the array and create the linked list
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = arrayToLinkedList(arr);

        System.out.print("LinkedList: ");
        printLinkedList(head);  // Output: LinkedList: 1 2 3 4 5
    }
}


//    class Node{
//        int data;
//        Node next;
//        Node(int data1, Node next1){
//            this.data=data1;
//            this.next=next1;
//        }
//        Node(int data1){
//            this.data=data1;
//            this.next=null;
//        }
//    };
//    public class ArrayToLinkList{
//        private static Node convertarr2LL(int[] arr){
//            Node head= new Node(arr[0]);
//            Node mover=head;
//            for (int i=1;i<arr.length;i++){
//                Node temp= new Node(arr[i]);
//                mover.next=temp;
//                mover=mover.next;
//            }
//            return head;
//        }
//        public static void main(String[] args){
//            int[] arr={2,5,8,7};
//            Node head=convertarr2LL(arr);
//            System.out.print(head.data);
//        }
//    }

//Another way
    /*
    public class Array2LinkedList {

    public static void main(String[] args) {

        // initialize array with some data
        String[] sa = new String[] { "A", "B", "C" };

        // convert array to LinkedList
        LinkedList ll = new LinkedList(Arrays.asList(sa));

        // iterate over each element in LinkedList and show what is in the list.
        Iterator iterator = ll.iterator();
        while (iterator.hasNext()) {
            // Print element to console
            System.out.println((String) iterator.next());
        }
    }
}
     */