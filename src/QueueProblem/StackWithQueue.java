package QueueProblem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackWithQueue {

    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        int size = queue.size();
        queue.add(x);
        for (int i = 0; i < size; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        StackWithQueue stack = new StackWithQueue();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements to push onto the stack: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            stack.push(x);
        }
        System.out.println("Stack elements in reverse order: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
