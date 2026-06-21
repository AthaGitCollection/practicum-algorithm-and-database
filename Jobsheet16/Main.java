package Jobsheet16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {


    static ArrayList<Grades> data = new ArrayList<>();


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int menu;


        do{


            System.out.println("\n********************************");
            System.out.println(" SISTEM PENGOLAHAN DATA NILAI ");
            System.out.println("********************************");


            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");


            System.out.print("Pilih : ");

            menu = sc.nextInt();



            switch(menu){


                case 1:


                    sc.nextLine();


                    System.out.print("NIM : ");
                    String nim = sc.nextLine();


                    System.out.print("Nama : ");
                    String nama = sc.nextLine();


                    System.out.print("Kode Mata Kuliah : ");
                    String kode = sc.nextLine();


                    System.out.print("Nama Mata Kuliah : ");
                    String matkul = sc.nextLine();


                    System.out.print("SKS : ");
                    int sks = sc.nextInt();


                    System.out.print("Nilai : ");
                    double nilai = sc.nextDouble();



                    Studentspracticum s = new Studentspracticum(nim,nama);

                    Courses c = new Courses(kode,matkul,sks);


                    data.add(new Grades(s,c,nilai));


                    break;



                case 2:


                    System.out.println("\nDAFTAR NILAI MAHASISWA");


                    for(Grades g : data){

                        g.print();

                    }


                    break;



                case 3:


                    sc.nextLine();


                    System.out.print("Masukkan NIM mahasiswa : ");

                    String cari = sc.nextLine();



                    for(Grades g : data){


                        if(g.student.nim.equals(cari)){


                            g.print();


                        }

                    }


                    break;



                case 4:


                    Collections.sort(data,(a,b)->

                        Double.compare(a.value,b.value)

                    );


                    System.out.println("Data berhasil diurutkan");


                    break;



                case 5:


                    System.out.println("Thank you!");

                    break;



                default:


                    System.out.println("Invalid menu");


            }


        }while(menu != 5);



        sc.close();

    }

}