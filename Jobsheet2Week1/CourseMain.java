package Jobsheet2Week1;

public class CourseMain {
    public static void main(String[] args) {

        // Object using default constructor
        Course c1 = new Course();
        c1.kodeCourse = "IF101";
        c1.name = "Basic Programming";
        c1.sks = 3;
        c1.numberOfHours = 6;

        c1.showInformation();
        c1.updateSKS(4);
        c1.addHours(2);
        c1.reduceHours(3);
        c1.showInformation();

        // Object using parameterized constructor
        Course c2 = new Course("IF202", "Data Structures", 3, 6);
        c2.showInformation();
        c2.addHours(1);
        c2.reduceHours(2);
        c2.showInformation();
    }
}