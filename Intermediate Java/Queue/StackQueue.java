// https://www.geeksforgeeks.org/problems/stack-using-two-queues/1?page=1&category=Queue&sortBy=submissions
// Solved using below logic

import java.util.LinkedList;
import java.util.Queue;

public class StackQueue {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int val) {
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        queue1.offer(val);
        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }
    }

    public int peek() {
        if (queue1.isEmpty()) {
            return -1;
        }

        return queue1.peek();
    }

    public int pop() {
        if (queue1.isEmpty()) {
            return -1;
        }

        return queue1.poll();
    }

    public static void main(String[] args) {
        StackQueue stack = new StackQueue();
        stack.push(10);
        System.out.println(stack.peek()); // 10
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.peek()); // 40
        System.out.println(stack.pop()); // 40
        System.out.println(stack.peek()); // 30
    }
}
