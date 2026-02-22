package Jobsheet2Week1;

public class Course {
    String kodeCourse;
    String name;
    int sks;
    int numberOfHours;

    // Default constructor
    public Course() {
    }

    // Parameterized constructor
    public Course(String kodeCourse, String name, int sks, int numberOfHours) {
        this.kodeCourse = kodeCourse;
        this.name = name;
        this.sks = sks;
        this.numberOfHours = numberOfHours;
    }

    // Display course information
    void showInformation() {
        System.out.println("Course Code: " + kodeCourse);
        System.out.println("Course Name: " + name);
        System.out.println("SKS: " + sks);
        System.out.println("Number of Hours: " + numberOfHours);
    }

    // Update SKS
    void updateSKS(int newSKS) {
        sks = newSKS;
        System.out.println("SKS has been updated.");
    }

    // Add hours
    void addHours(int hours) {
        numberOfHours += hours;
        System.out.println("Hours added.");
    }

    // Reduce hours
    void reduceHours(int hours) {
        if (hours <= numberOfHours) {
            numberOfHours -= hours;
            System.out.println("Hours reduced.");
        } else {
            System.out.println("Cannot reduce hours. Not enough hours.");
        }
    }
}