package Jobsheet11Week12;

public class QueueLinkedList {

    Node front, rear;
    int size = 0;
    int max = 10;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue cleared!");
    }

    void enqueue(Student s) {

        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        Node newNode = new Node(s, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;

        System.out.println(s.name + " added to queue");
    }

    void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Calling student:");
        front.data.print();

        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
    }

    void viewFront() {
        if (!isEmpty()) {
            System.out.println("Front student:");
            front.data.print();
        }
    }

    void viewRear() {
        if (!isEmpty()) {
            System.out.println("Rear student:");
            rear.data.print();
        }
    }

    void totalQueue() {
        System.out.println("Total queue: " + size);
    }

    void printAll() {

        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        Node temp = front;

        while (temp != null) {
            temp.data.print();
            temp = temp.next;
        }
    }
}