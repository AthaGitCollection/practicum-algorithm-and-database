package Jobsheet11;

import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueue q = new KRSQueue(10);
        int choice;

        do {
            System.out.println("\n=== KRS Queue ===");
            System.out.println("1. Add Student");
            System.out.println("2. Process KRS (2 students)");
            System.out.println("3. Show All");
            System.out.println("4. Show Front 2");
            System.out.println("5. Show Last");
            System.out.println("6. Info");
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
                    System.out.print("Program: ");
                    String prodi = sc.nextLine();
                    System.out.print("Class: ");
                    String cls = sc.nextLine();

                    q.enqueue(new Student(nim, name, prodi, cls));
                    break;

                case 2:
                    q.processKRS();
                    break;

                case 3:
                    q.printAll();
                    break;

                case 4:
                    q.viewFrontTwo();
                    break;

                case 5:
                    q.viewRear();
                    break;

                case 6:
                    q.info();
                    break;
            }

        } while (choice != 0);

        sc.close();
    }
}