/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hanafiilham_2311103146;

/**
 *
 * @author hanaf
 */
class KomputerVIP extends Komputer {
    protected boolean vipCard;
    
    // constructor
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerjam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerjam);
        this.vipCard = vipCard;
    }
    
   // override
   @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("VIP Card: " + (vipCard ? "Tersedia" : "Tidak Tersedia"));
        if(vipCard){
            System.out.println("Fasilitas Ruang Premium :");
            System.out.println("- Ruangan ber -AC pribadi ");
            System.out.println("Sofa Gaming Exclusive");
            System.out.println("Komputer Spesifikasi tinggi");
            System.out.println("Koneksi internet dedicated 100mbps");
        }
    }
    
}
