/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbouts_muhammadrafiawallaisal;
// @Muhammad Rafi Awallaisal
// S1SI07C
// 231103134
class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;
   
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    
    @Override
    public void informasi() {
        super.informasi();
        if (ruangPrivat) {
            System.out.println("Status: Ruangan Premium");
            System.out.println("Fasilitas Ruang Premium:");
            System.out.println("- Ruangan ber-AC dan private");
            System.out.println("- Kursi gaming eksklusif");
            System.out.println("- Komputer spesifikasi tinggi ");
            System.out.println("- Koneksi internet Berkekuatan 500Mbps");
        } else {
            System.out.println("Status          : Ruangan Standar");
            System.out.println("\nFasilitas Ruang Standar:");
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa majapahit");
            System.out.println("- Komputer spesifikasi rendah");
            System.out.println("- Koneksi internet dedicated 10Mbps");
        }
    }

    public void pesan(int nomorKomputer) {
        System.out.println("Memesan komputer nomor    : " + nomorKomputer);
    }

    public void tambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan  : " + makanan);
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan makanan dan minuman: " + makanan + " dan " + minuman);
    }
}