package Jobsheet3Week3;
import java.util.Scanner;

public class MatakuliahDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Matakuliah03[] arrayOfMatakuliah = new Matakuliah03[jumlah];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));

            System.out.print("Kode  : ");
            kode = sc.nextLine();

            System.out.print("Nama  : ");
            nama = sc.nextLine();

            System.out.print("SKS  : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);

            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            System.out.println("---------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah03(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].printInfo();
        }
    }
}