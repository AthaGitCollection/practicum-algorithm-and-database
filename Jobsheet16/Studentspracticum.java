package Jobsheet16;

public class Studentspracticum {

    String nim;
    String name;


    public Studentspracticum(String nim, String name){

        this.nim = nim;
        this.name = name;

    }


    public void print(){

        System.out.print(nim + "\t" + name);

    }

}