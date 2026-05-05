package Jobsheet10;

import java.util.Scanner;

public class MainExcuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExcuseLetterStack stack = new ExcuseLetterStack(5);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search by Name");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Class: ");
                    String cls = sc.nextLine();
                    System.out.print("Type (S/I): ");
                    char type = sc.next().charAt(0);
                    System.out.print("Duration: ");
                    int dur = sc.nextInt();
                    sc.nextLine();

                    stack.push(new ExcuseLetter(id, name, cls, type, dur));
                    break;

                case 2:
                    ExcuseLetter data = stack.pop();
                    if (data != null) {
                        System.out.println("Processed:");
                        data.display();
                    }
                    break;

                case 3:
                    ExcuseLetter top = stack.peek();
                    if (top != null) {
                        System.out.println("Latest Letter:");
                        top.display();
                    } else {
                        System.out.println("No data");
                    }
                    break;

                case 4:
                    System.out.print("Search name: ");
                    String key = sc.nextLine();
                    stack.searchByName(key);
                    break;
            }

        } while (choice != 5);

        sc.close();
    }
}