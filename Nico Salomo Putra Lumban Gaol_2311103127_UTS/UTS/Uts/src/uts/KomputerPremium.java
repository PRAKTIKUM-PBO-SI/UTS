/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author LENOVO
 */
class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;
    
    //constructor
    public KomputerPremium(int jumlahKomputer, String namaWarnet, int hargaPerJam){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    @Override
    public void informasi() {
        super.informasi();
        System.out.println("VIP CARD: " + (ruangPrivat ? "Tersedia" : "Tidak tersedia"));
    }
    public void pesan(int komputerNomor){
        System.out.println("memesan komputer nomor : " + komputerNomor + "diterima");
    }
    public void menambahLayanan(String makanan){
        System.out.println("Menambah layanan makanan : " + makanan);
    }
    public void menambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan :" + makanan + " dan " + minuman);
    }
    
    
}
