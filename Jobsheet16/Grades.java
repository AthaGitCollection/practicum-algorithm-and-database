package Jobsheet16;

public class Grades {


    Studentspracticum student;
    Courses course;
    double value;



    public Grades(Studentspracticum student, Courses course, double value){

        this.student = student;
        this.course = course;
        this.value = value;

    }



    public void print(){

        student.print();

        System.out.print("\t");

        course.print();

        System.out.println("\t" + value);

    }

}