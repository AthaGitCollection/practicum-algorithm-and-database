package Jobsheet11Week12;

public class Student3 {
    String nim;
    String name;
    String ClassName;
    double gpa;

    public Student3() {

    }
    public Student3(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        ClassName = kls;
        gpa = ip;
    }
    void print(){
        System.out.println(nim + " - "+name+" - "+ ClassName+" - "+gpa);
    }
    }


