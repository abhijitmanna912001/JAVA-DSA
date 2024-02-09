// https://www.geeksforgeeks.org/problems/queue-using-two-stacks/1?page=1&category=Queue&sortBy=submissions
// Solved using below logic

import java.util.Stack;

public class QueueStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int val) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(val);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

    }

    public int dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return stack1.pop();
    }

    public int peek() {
        if (stack1.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack1.peek();
    }

    public static void main(String[] args) {
        QueueStack queue = new QueueStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Peek is " + queue.peek());
        System.out.println("Dequeue is " + queue.dequeue());
        queue.enqueue(7);
        System.out.println("Peek is " + queue.peek());
    }

}
