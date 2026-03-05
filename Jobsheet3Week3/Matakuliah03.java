package Jobsheet3Week3;

public class Matakuliah03 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah03(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void addData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void printInfo() {
        System.out.println("Kode MK   : " + kode);
        System.out.println("Nama MK   : " + nama);
        System.out.println("SKS       : " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("----------------------");
    }
}