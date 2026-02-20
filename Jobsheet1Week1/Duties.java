import java.util.Scanner;

public class Duties {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input number of schedules: ");
        int n = input.nextInt();
        input.nextLine();

        String[][] schedule = new String[n][4];

        // Input data
        for (int i = 0; i < n; i++) {
            System.out.println("\nSchedule " + (i + 1));

            System.out.print("Course Name: ");
            schedule[i][0] = input.nextLine();

            System.out.print("Room: ");
            schedule[i][1] = input.nextLine();

            System.out.print("Day: ");
            schedule[i][2] = input.nextLine();

            System.out.print("Time: ");
            schedule[i][3] = input.nextLine();
        }

        // b. Display all schedule
        System.out.println("\nALL SCHEDULE");
        for (int i = 0; i < n; i++) {
            System.out.println(
                schedule[i][0] + " | " +
                schedule[i][1] + " | " +
                schedule[i][2] + " | " +
                schedule[i][3]
            );
        }

        // c. Display by day
        System.out.print("\nSearch by Day: ");
        String searchDay = input.nextLine();

        System.out.println("Result:");
        for (int i = 0; i < n; i++) {
            if (schedule[i][2].equalsIgnoreCase(searchDay)) {
                System.out.println(
                    schedule[i][0] + " | " +
                    schedule[i][1] + " | " +
                    schedule[i][3]
                );
            }
        }

        // d. Display by course
        System.out.print("\nSearch by Course Name: ");
        String searchCourse = input.nextLine();

        System.out.println("Result:");
        for (int i = 0; i < n; i++) {
            if (schedule[i][0].equalsIgnoreCase(searchCourse)) {
                System.out.println(
                    "Room: " + schedule[i][1] +
                    ", Day: " + schedule[i][2] +
                    ", Time: " + schedule[i][3]
                );
            }
        }

        input.close();
    }
}