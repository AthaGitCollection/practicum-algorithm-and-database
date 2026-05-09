package Jobsheet11Week12;

import java.util.Scanner;

public class MainQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QueueLinkedList q = new QueueLinkedList();

        int choice;

        do {

            System.out.println("\n=== STUDENT SERVICE QUEUE ===");
            System.out.println("1. Add Student");
            System.out.println("2. Call Student");
            System.out.println("3. View Front");
            System.out.println("4. View Rear");
            System.out.println("5. Total Queue");
            System.out.println("6. Print All");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");

            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("NIM: ");
                    String nim = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Class: ");
                    String cls = sc.nextLine();

                    Student s = new Student(nim, name, cls);

                    q.enqueue(s);

                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.viewFront();
                    break;

                case 4:
                    q.viewRear();
                    break;

                case 5:
                    q.totalQueue();
                    break;

                case 6:
                    q.printAll();
                    break;

                case 7:
                    q.clear();
                    break;

                case 0:
                    System.out.println("Program finished");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}