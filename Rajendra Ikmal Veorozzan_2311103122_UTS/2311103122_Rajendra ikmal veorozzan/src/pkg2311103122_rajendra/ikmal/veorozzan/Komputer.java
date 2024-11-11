package pkg2311103122_rajendra.ikmal.veorozzan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 // RAJENDRA IKMAL VEOROZZAN

public class Komputer {
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;

    public Komputer(int jumlah, String nama, float harga) {
        this.jumlahKomputer = jumlah;
        this.namaWarnet = nama;
        this.hargaPerJam = harga;
    }

    public void tampilkanInformasi() {
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah Komputer  : " + jumlahKomputer);
        System.out.println("Nama Warnet      : " + namaWarnet);
        System.out.println("Harga Per Jam    : Rp" + hargaPerJam);
    }
}



