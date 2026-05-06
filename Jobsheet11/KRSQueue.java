package Jobsheet11;

public class KRSQueue {
    Student[] data;
    int front, rear, size, max;
    int processed = 0;

    public KRSQueue(int n) {
        max = n;
        data = new Student[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Queue cleared!");
    }

    void enqueue(Student s) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = s;
        size++;
        System.out.println(s.name + " added to queue");
    }

    // process 2 students
    void processKRS() {
        if (size < 2) {
            System.out.println("Not enough students to process (min 2)");
            return;
        }

        for (int i = 0; i < 2; i++) {
            Student s = data[front];
            System.out.println("Processed: ");
            s.print();

            front = (front + 1) % max;
            size--;
            processed++;
        }
    }

    void printAll() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return;
        }

        int i = front;
        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
    }

    void viewFrontTwo() {
        if (size == 0) {
            System.out.println("Queue empty");
        } else if (size == 1) {
            data[front].print();
        } else {
            data[front].print();
            data[(front + 1) % max].print();
        }
    }

    void viewRear() {
        if (!isEmpty()) {
            System.out.println("Last student:");
            data[rear].print();
        }
    }

    void info() {
        System.out.println("Total in queue: " + size);
        System.out.println("Processed: " + processed);
        System.out.println("Not processed: " + (30 - processed));
    }
}