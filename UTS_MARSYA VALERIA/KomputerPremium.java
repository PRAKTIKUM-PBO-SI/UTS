/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsmarsya;

/**
 *
 * @author MARSYA VALERIA
 * 2311103105
 * 07C
 */
public class KomputerPremium extends Komputer{
    protected boolean ruangPrivat;

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Jenis Ruangan : " + (ruangPrivat ? "Ruang Privat" : "Ruang Standar"));
        if (ruangPrivat) {
            System.out.println("Fasilitas : Kursi eksklusif dan privasi tinggi");
        } else {
            System.out.println("Fasilitas : Fasilitas standar");
        }
    }

    public void pesan(int nomorKomputer) {
        System.out.println("Nomor komputer yang dipesan : " + nomorKomputer);
    }

    public void tambahLayanan(String makanan) {
        System.out.println("Tambahan layanan makanan : " + makanan);
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Tambahan layanan makanan : " + makanan + " dan minuman : " + minuman);
    }
}

