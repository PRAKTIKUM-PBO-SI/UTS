/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AchmadShodiq_2311103140;

/**
 *
 * @achmadshodiq2311103140
 */
class Computer {
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;
    final int jumlahComputer;

    // Constructor Komputer
    public Computer(int jumlahcomputer, String namaWarnet, float hargaPerJam) {
        this.jumlahComputer = jumlahcomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }

    // Method informasi
    public void informasi() {
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah Komputer : " + jumlahComputer);
        System.out.println("Nama Warnet     : " + namaWarnet);
        System.out.println("Harga Per Jam   : Rp" + hargaPerJam);
        System.out.println("=================================");
    }
}

