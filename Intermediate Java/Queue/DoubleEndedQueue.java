public class DoubleEndedQueue {
    int rear;
    int front;
    int size;
    int capacity;
    int doubleEndedqueue[];

    public DoubleEndedQueue(int capacity) {
        doubleEndedqueue = new int[capacity];
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

    public int peekFront() {
        if (isEmpty()) {
            // Queue is empty
            return -1;
        }
        return doubleEndedqueue[front];
    }

    public int peekRear() {
        if (isEmpty()) {
            // Queue is empty
            return -1;
        }
        return doubleEndedqueue[rear];
    }

    public void enqueueFront(int val) {
        if (isFull()) {
            // Queue is full
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if (front == 0 && rear != capacity - 1) {
            front = capacity - 1;
        } else {
            front--;
        }
        size++;
        doubleEndedqueue[front] = val;
    }

    public void enqueueRear(int val) {
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
        doubleEndedqueue[rear] = val;
    }

    public int dequeueFront() {
        if (isEmpty()) {
            // Queue is empty
            return -1;
        }

        int val = doubleEndedqueue[front];
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

    public int dequeueRear() {
        if (isEmpty()) {
            // Queue is empty
            return -1;
        }

        int val = doubleEndedqueue[rear];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear--;
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
                System.out.print(doubleEndedqueue[i]);
                System.out.print(",");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(doubleEndedqueue[i]);
                if (i != rear) {
                    System.out.print(",");
                }
            }

        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(doubleEndedqueue[i]);
                if (i != rear) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleEndedQueue doubleEndedQueue = new DoubleEndedQueue(5);
        System.out.println("Capacity is: " + 5);
        System.out.println("Print:");
        doubleEndedQueue.printQueue();
        System.out.println("Insert element Front:" + 7);
        doubleEndedQueue.enqueueFront(7);
        System.out.println("Peak Front element: " + doubleEndedQueue.peekFront());
        System.out.println("Insert element Rear:" + 8);
        doubleEndedQueue.enqueueRear(8);
        System.out.println("Peak Rear element: " + doubleEndedQueue.peekRear());
        System.out.println("Insert element Front:" + 9);
        doubleEndedQueue.enqueueFront(9);
        System.out.println("Peak Front element: " + doubleEndedQueue.peekFront());
        System.out.println("Insert element Rear:" + 11);
        doubleEndedQueue.enqueueRear(11);
        System.out.println("Insert element Front:" + 19);
        doubleEndedQueue.enqueueFront(19);
        System.out.println("Insert element Rear:" + 9);
        doubleEndedQueue.enqueueRear(9);
        System.out.println("is deque full: " + doubleEndedQueue.isFull());
        System.out.println("Print:");
        doubleEndedQueue.printQueue();
        System.out.println("delete element Front");
        doubleEndedQueue.dequeueFront();
        System.out.println("is deque full: " + doubleEndedQueue.isFull());
        System.out.println("Print:");
        doubleEndedQueue.printQueue();
        System.out.println("Insert element Rear:" + 19);
        doubleEndedQueue.enqueueRear(19);
        System.out.println("Print:");
        doubleEndedQueue.printQueue();
        System.out.println("Peak element Rear: " + doubleEndedQueue.peekRear());
        System.out.println("delete Front element");
        doubleEndedQueue.dequeueFront();
        System.out.println("Peak element Rear: " + doubleEndedQueue.peekRear());

        System.out.println("is deque empty: " + doubleEndedQueue.isEmpty());

        System.out.println("Print:");
        doubleEndedQueue.printQueue();
        System.out.println("delete Rear element");
        doubleEndedQueue.dequeueRear();
        System.out.println("delete Rear element");
        doubleEndedQueue.dequeueRear();
        System.out.println("delete Rear element");
        doubleEndedQueue.dequeueRear();
        System.out.println("delete Rear element");
        doubleEndedQueue.dequeueRear();
        System.out.println("is deque empty: " + doubleEndedQueue.isEmpty());
        System.out.println("Print:");
        doubleEndedQueue.printQueue();
        System.out.println("delete Front element");
        doubleEndedQueue.dequeueFront();
    }
}
