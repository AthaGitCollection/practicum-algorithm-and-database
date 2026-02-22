package Jobsheet2Week1;

public class Lecturer {
    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    // Default constructor
    public Lecturer() {
    }

    // Parameterized constructor
    public Lecturer(String idLecturer, String name, boolean activeStatus, int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    // Display information
    void showInformation() {
        System.out.println("ID: " + idLecturer);
        System.out.println("Name: " + name);
        System.out.println("Active Status: " + activeStatus);
        System.out.println("Year Of Entry: " + yearOfEntry);
        System.out.println("Expertise: " + expertiseCompetency);
    }

    // Set active status
    void setActiveStatus(boolean status) {
        activeStatus = status;
    }

    // Calculate working period
    int calculateTimeWork(int yearNow) {
        return yearNow - yearOfEntry;
    }

    // Change skill
    void changeSkill(String skill) {
        expertiseCompetency = skill;
    }
}