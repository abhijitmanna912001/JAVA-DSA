public class CircularQueue {
    int rear;
    int front;
    int size;
    int capacity;
    int circularqueue[];

    public CircularQueue(int capacity) {
        circularqueue = new int[capacity];
        this.capacity = capacity;
        size = 0;
        rear = front = -1;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if ((front == 0 && rear == capacity - 1) || (front != 0 && rear == (front - 1) % capacity)) {
            return true;
        }
        return false;
    }

    public int peek() {
        if (isEmpty()) {
            // Queue is empty
            return -1;
        }
        return circularqueue[front];
    }

    public void enqueue(int val) {
        if (isFull()) {
            // Queue is full
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if (rear == capacity - 1 && front != 0) {
            rear = 0;
        } else {
            rear++;
        }
        size++;
        circularqueue[rear] = val;
    }

    public int dequeue() {
        if (isEmpty()) {
            // Queue is empty
            return -1;
        }

        int val = circularqueue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front++;
        }
        size--;
        return val;
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty");
            return;
        }

        if (rear <= front) {
            for (int i = front; i <= capacity - 1; i++) {
                System.out.print(circularqueue[i]);
                System.out.print(",");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(circularqueue[i]);
                if (i != rear) {
                    System.out.print(",");
                }
            }

        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(circularqueue[i]);
                if (i != rear) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue myCircularQueue = new CircularQueue(5);
        System.out.println("Capacity is: " + 5);
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("Insert element :" + 7);
        myCircularQueue.enqueue(7);
        System.out.println("Peak element: " + myCircularQueue.peek());
        System.out.println("Insert element :" + 8);
        myCircularQueue.enqueue(8);
        System.out.println("Peak element: " + myCircularQueue.peek());
        System.out.println("Insert element :" + 9);
        myCircularQueue.enqueue(9);
        System.out.println("Peak element: " + myCircularQueue.peek());
        System.out.println("Insert element :" + 11);
        myCircularQueue.enqueue(11);
        System.out.println("Insert element :" + 19);
        myCircularQueue.enqueue(19);
        System.out.println("Insert element :" + 9);
        myCircularQueue.enqueue(9);
        System.out.println("is Queue full: " + myCircularQueue.isFull());
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("is Queue full: " + myCircularQueue.isFull());
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("Insert element :" + 19);
        myCircularQueue.enqueue(19);
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("Peak element: " + myCircularQueue.peek());
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("Peak element: " + myCircularQueue.peek());

        System.out.println("is Queue empty: " + myCircularQueue.isEmpty());

        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
        System.out.println("is Queue empty: " + myCircularQueue.isEmpty());
        System.out.println("Print:");
        myCircularQueue.printQueue();
        System.out.println("delete element");
        myCircularQueue.dequeue();
    }
}
