/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_anggitrefiyan_2311103142;

/**
 *
 * @author Anggit Refiyan
 * 2311103142
 * 7c
 */
public class Komputer {
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerjam;
    
    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerjam){
    this.jumlahKomputer = jumlahKomputer;
    this.namaWarnet = namaWarnet;
    this.hargaPerjam = hargaPerjam;
    
    }

    public void informasi(){
    System.out.println("INFORMASI KOMPUTER");
    System.out.println("Jumlah Komputer : " + jumlahKomputer);
    System.out.println("Nama Warnet : " + namaWarnet);
    System.out.println("Harga Perjam : " + hargaPerjam);
    }
}
