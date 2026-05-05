package Jobsheet10;
import java.util.Scanner;
public class StudentDemo3 {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentAssignmentStack3 stack = new StudentAssignmentStack3(5);
        int choice;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Assignment");
            System.out.println("2. Grade Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignments");
            System.out.println("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine();  // consume newline
            
            switch (choice) {
                case 1:
                    if (!stack.isFull()) {
                        System.out.print("Name: ");
                        String name = scan.nextLine();
                        System.out.print("NIM: ");
                        String nim = scan.nextLine();
                        System.out.print("Class Name: ");
                        String className = scan.nextLine();
                        
                        Student3 student = new Student3(nim, name, className);
                        stack.push(student);
                        System.out.println(name + "'s assignment has been successfully submitted!!");
                    } else {
                        System.out.println("Stack is full! Cannot submit more assignments.");
                    }
                    break;
                    
                case 2:
                Student3 graded = stack.pop();
            if (graded != null) {
                System.out.println("Grading assignment from " + graded.name);
                System.out.print("Input grade (0-100): ");

                int grade = scan.nextInt();
                     graded.grading(grade);

                System.out.printf("Assignment grade of %s is %d\n", graded.name, grade);
                
                String binary = stack.convertToBinary(grade);
                System.out.printf("Assignment grade in binary is %s\n", binary);
                 }
                break;

                case 3:
                    Student3 top = stack.peek();
                    if (top != null) {
                        System.out.println("The last assignment comes from " + top.name);
                    }
                    break;
                    
                case 4:
                    if (!stack.isEmpty()) {
                        System.out.println("Assignment list:");
                        System.out.println("Name\tNIM\tClass Name");
                        stack.print();
                    } else {
                        System.out.println("No assignments in stack.");
                    }
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice >= 1 && choice <= 4);
        
        scan.close();
    }
    
}
