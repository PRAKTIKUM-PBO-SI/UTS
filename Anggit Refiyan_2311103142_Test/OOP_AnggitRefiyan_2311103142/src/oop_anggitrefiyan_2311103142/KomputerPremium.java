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
public class KomputerPremium extends Komputer{
    protected boolean ruangPrivat;
    
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerjam, boolean ruangPrivat){
    super(jumlahKomputer, namaWarnet, hargaPerjam);
    this.ruangPrivat = ruangPrivat;
    }
    
    @Override
    public void informasi(){
    if(ruangPrivat){    
       System.out.println("fasilitas ruang premium");
       System.out.println("-ruangan ber-AC pribadi");
       System.out.println("-sofa gaming exclusive");
       System.out.println("-komputer spesifikasi tinggi");
       System.out.println("-koneksi internet dedicated 100mbps");
    } else {
       System.out.println("fasilitas ruang standar");
       System.out.println("-ruangan gerah");
       System.out.println("-sofa majapahit");
       System.out.println("-komputer spesifikasi rendah");
       System.out.println("-koneksi internet dedicated 1mbps");
    }
    }
    
    public void pesan(int nomorKomputer){
      System.out.println("Login dengan username : " + nomorKomputer);
    }
    
    public void tambahLayanan(String makanan){
        System.out.println("Tambah " + makanan);
    }
    
    public void tambahLayanan(String makanan, String minuman){
        System.out.println("Tambah " + makanan + "dan minuman: " + minuman);
    }
}
