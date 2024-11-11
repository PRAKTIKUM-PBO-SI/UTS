/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul2wildan;

/**
 *
 * @author Wildan
 */

public class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;

    // Constructor
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    // Overriding Method informasi
    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Ruang Privat: " + (ruangPrivat ? "Tersedia" : "Tidak Tersedia"));
    }

    // Method pesan
    public void pesan(int nomorKomputer) {
        System.out.println("Pesan untuk komputer nomor " + nomorKomputer + " diterima.");
    }

    // Overloading Method tambahLayanan
    public void tambahLayanan(String makanan) {
        System.out.println("Layanan tambahan: " + makanan);
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Layanan tambahan: " + makanan + " dan " + minuman);
    }
}


