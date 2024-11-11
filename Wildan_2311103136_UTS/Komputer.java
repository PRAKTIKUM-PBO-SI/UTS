/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jurnalmodul2wildan;

/**
 *
 * @author Wildan
 */
public class Komputer {
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;

    // Constructor
    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam) {
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }

    // Method informasi
    public void informasi() {
        System.out.println("Nama Warnet: " + namaWarnet);
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
        System.out.println("Harga per Jam: " + hargaPerJam);
    }
}
    
    

