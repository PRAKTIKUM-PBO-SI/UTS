/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hanafiilham_2311103146;

/**
 *
 * @author hanaf
 */
class komputerPremium extends Komputer {
    protected boolean ruangPrivat;

    public komputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerjam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerjam);
        this.ruangPrivat = ruangPrivat;
        
    }
    
    // ovveride
   @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("VIP Card: " + (ruangPrivat? "Tersedia" : "Tidak Tersedia"));
    }
    
    // Method untuk memesan komputer
    public void pesanKomputer(int nomorKomputer) {
        System.out.println("Memesan Komputer Nomor " + nomorKomputer + " diterima.");
    }

    // Overloading method untuk layanan tambahan
    public void tambahLayanan(String makanan) {
        System.out.println("Menambah Layanan tambahan: " + makanan);
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah Layanan tambahan: " + makanan + " dan " + minuman);
    } 
}
