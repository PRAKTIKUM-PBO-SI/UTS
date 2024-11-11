/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hanafiilham_2311103146;

/**
 *
 * @author hanaf
 */
public class Komputer {
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerjam;
    
    // constructor
    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerjam) {
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerjam = hargaPerjam;
    }

    void tampilkanInformasi() {
        System.out.println("Informasi Komputer :");
        System.out.println("Jumlah Komputer : " + jumlahKomputer);
        System.out.println("Nama Warnet : " + namaWarnet);
        System.out.println("Harga Perjam : " + hargaPerjam);
    }
}
