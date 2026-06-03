package Jobsheet14;

public class Student03 {
    String nim, name, className;
    double ipk;

    public Student03(){
    }
    public Student03(String nm, String nama, String kls, double ip){
        nim = nm;
        name = nama;
        className = kls;
        ipk = ip;
    }
    void print (){
        System.out.println(nim + " - "+name+" - "+className+" - "+ipk);
    }
}
