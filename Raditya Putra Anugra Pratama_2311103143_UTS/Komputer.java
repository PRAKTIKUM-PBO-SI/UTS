package com.mycompany.oop_raditya_2311103143;

/**
 * @author Raditya Putra Anugra Pratama
 * 2311103143
 * S1SI07C
 */
// Class Komputer
class Komputer {
    protected int jumlahComputer;
    protected String namaWarnet;
    protected float hargaPerJam;
    final int jumlahKomputer;

    // Constructor Komputer
    public Komputer(int jumlahkomputer, String namaWarnet, float hargaPerJam) {
        this.jumlahKomputer = jumlahkomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }

    // Method informasi
    public void informasi() {
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah Komputer : " + jumlahKomputer);
        System.out.println("Nama Warnet     : " + namaWarnet);
        System.out.println("Harga Per Jam   : Rp" + hargaPerJam);
        System.out.println("=================================");
    }
}