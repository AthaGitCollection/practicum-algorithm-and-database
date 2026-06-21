package Jobsheet16;

public class Courses {

    String code;
    String name;
    int sks;


    public Courses(String code, String name, int sks){

        this.code = code;
        this.name = name;
        this.sks = sks;

    }


    public void print(){

        System.out.print(code + "\t" + name + "\t" + sks);

    }

}