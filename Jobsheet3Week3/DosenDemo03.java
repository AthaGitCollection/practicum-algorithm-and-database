package Jobsheet3Week3;
import java.util.Scanner;

public class DosenDemo03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of lecturers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Dosen03[] arrayOfDosen = new Dosen03[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Input Lecturer Data-" + (i + 1));

            System.out.print("Code  : ");
            String code = sc.nextLine();

            System.out.print("Name  : ");
            String name = sc.nextLine();

            System.out.print("Gender (true=Male / false=Female) : ");
            boolean gender = sc.nextBoolean();

            System.out.print("Age : ");
            int age = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen03(code, name, gender, age);

            System.out.println("----------------------------");
        }

        DataDosen03 data = new DataDosen03();

        System.out.println("\nAll Lecturer Data");
        data.dataAllDosen(arrayOfDosen);

        System.out.println("\nNumber of Lecturers Per Gender");
        data.numberOfLecturersPerGender(arrayOfDosen);

        System.out.println("\nAverage Age Per Gender");
        data.AverageAgeOfLecturersPerGender(arrayOfDosen);

        System.out.println();
        data.infoDosenPalingTua(arrayOfDosen);

        System.out.println();
        data.infoDosenMostYoungest(arrayOfDosen);
    }
}