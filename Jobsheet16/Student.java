package Jobsheet16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    String nim, nama, notelp;

    public Student(){

    }

    public Student(String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp= notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }

    List<Student> mahasiswas = new ArrayList<>();

    public void tambah(Student... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index){
        mahasiswas.remove(index);
    }

    public void update(int index, Student mhs){
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    } 

    int linearSearch(String nim ) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Student lm = new Student();
        Student m = new Student("201234", "Noureen", "021xx1");
        Student m1 = new Student("201235", "Akhleema", "021xx2");
        Student m2 = new Student("201236", "Shannum", "021xx3");

        lm.tambah(m,m1,m2);

        lm.tampil();

        lm.update(lm.linearSearch("201235"), new Student("201235","Akhleema Lela", "021xx2" ));
        System.out.println("");
        lm.tampil();


    }
}