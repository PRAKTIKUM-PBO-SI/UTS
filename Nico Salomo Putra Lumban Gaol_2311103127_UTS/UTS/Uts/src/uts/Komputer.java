/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author LENOVO
 */
    class Komputer {

    static void tampilkanInformasi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;
    
    //constructor
    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam) {
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam; 
    }   
    public void informasi() {
        System.out.println("Nama Warnet: " + namaWarnet);
        System.out.println("Harga Per Jam :" + hargaPerJam);
        System.out.println("Jumlah Komputer : " + jumlahKomputer);
    }
    
}
