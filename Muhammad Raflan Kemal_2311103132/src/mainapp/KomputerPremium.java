/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

/**
 *
 * @author Muhammad Raflan Kemal 2311103132 07C
 */
class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;
    
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status : " + (ruangPrivat ? "Ruang Premium" : "Ruangan Standar"));
        if (ruangPrivat) {
            System.out.println("Fasilitas Ruang Premium:");
            System.out.println("- Sofa dan AC");
            System.out.println("- Komputer spek dewa");
            System.out.println("- Koneksi internet ngebut banget buset");
        } else {
            System.out.println("Fasilitas Ruang Standar:");
            System.out.println("- Ruangan gerah ");
            System.out.println("- Komputer lemot dikit ga ngaruh");
            System.out.println("- Koneksi internet lelet amayy");
        }
    }

    public void pesan(int nomorKomputer) {
        System.out.println("Memesan komputer nomor : " + nomorKomputer);
    }

    public void tambahLayanan(String makanan) {
        System.out.println("Memesan layanan makanan : " + makanan);
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Memesan layanan makanan : " + makanan + " dan minuman : " + minuman);
    }
}
