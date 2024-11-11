/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

/**
 *
 * @author Tigris Yedija Maarende
 * 2311103103
 */
class KomputerPremium extends Komputer {
    protected boolean ruangKhusus;

    public KomputerPremium(int totalKomputer, String namaCafe, float tarifPerJam, boolean ruangKhusus) {
        super(totalKomputer, namaCafe, tarifPerJam);
        this.ruangKhusus = ruangKhusus;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ruang Khusus: " + (ruangKhusus ? "Ada" : "Tidak Ada"));
    }

    public void pesanRuang(int nomorKomputer) {
        System.out.println("Pemesanan untuk komputer nomor " + nomorKomputer + " telah diterima.");
    }

    public void layananTambahan(String makanan) {
        System.out.println("Layanan tambahan: " + makanan);
    }

    public void layananTambahan(String makanan, String minuman) {
        System.out.println("Layanan tambahan: " + makanan + " dan " + minuman);
    }
}
