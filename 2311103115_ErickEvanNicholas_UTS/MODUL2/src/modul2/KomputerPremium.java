/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author Erick Evan Nicholas
 * 2311103115
 * S1SI-07C
 */
class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;

    public KomputerPremium(String namaWarnet, float hargaPerJam, int jumlahKomputer, boolean ruangPrivat) {
        super(namaWarnet, hargaPerJam, jumlahKomputer);
        this.ruangPrivat = ruangPrivat;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Ruang Privat: " + (ruangPrivat ? "Tersedia" : "Tidak Tersedia"));
    }

    public void pesan(int nomorKomputer) {
        System.out.println("Komputer nomor " + nomorKomputer + " telah dipesan di ruang premium.");
    }

    public void tambahLayanan(String makanan) {
        System.out.println("Layanan makanan: " + makanan + " ditambahkan.");
    }
public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Layanan makanan: " + makanan + " dan minuman: " + minuman + " ditambahkan.");
    }
}