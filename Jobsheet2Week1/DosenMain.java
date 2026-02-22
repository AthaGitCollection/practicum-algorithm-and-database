package Jobsheet2Week1;

public class DosenMain {
    public static void main(String[] args) {

        // Object 1 - default constructor
        Lecturer l1 = new Lecturer();
        l1.idLecturer = "L001";
        l1.name = "Dr. Ahmad";
        l1.activeStatus = true;
        l1.yearOfEntry = 2015;
        l1.expertiseCompetency = "Data Science";

        l1.showInformation();
        System.out.println("Years of Work: " + l1.calculateTimeWork(2025));
        l1.changeSkill("Artificial Intelligence");
        l1.showInformation();

        // Object 2 - parameterized constructor
        Lecturer l2 = new Lecturer("L002", "Dr. Sari", true, 2018, "Software Engineering");
        l2.showInformation();
        System.out.println("Years of Work: " + l2.calculateTimeWork(2025));
        l2.setActiveStatus(false);
        l2.showInformation();
    }
}