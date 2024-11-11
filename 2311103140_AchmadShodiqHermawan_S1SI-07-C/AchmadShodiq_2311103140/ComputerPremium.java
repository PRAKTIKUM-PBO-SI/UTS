/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AchmadShodiq_2311103140;

/**
 *
 * @achmadshodiq2311103140
 */

class ComputerPremium extends Computer {
    protected boolean ruangPrivat;

    // Constructor KomputerPremium
    public ComputerPremium(int jumlahComputer, String namaWarnet, int hargaPerJam, boolean ruangPrivat) {
        super(jumlahComputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    // Overriding Method informasi
    @Override
    public void informasi() {
       super.informasi();
        if (ruangPrivat) {
            System.out.println("Fasilitas Ruang Premium:");
            System.out.println("- Ruangan ber-AC pribadi");
            System.out.println("- Sofa empuk exclusive");
            System.out.println("- Komputer spesifikasi tinggi");
            System.out.println("- Koneksi internet dedicated 100Mbps");
        } else {
            System.out.println("Fasilitas Ruang Standar:");
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa majapahit");
            System.out.println("- Komputer spesifikasi rendah");
            System.out.println("- Koneksi internet dedicated 1Mbps");
        }
        System.out.println("=================================");
    }

    // Method pesan
    public void pesan(int nomorKomputer) {
        System.out.println("Memesan komputer nomor " + nomorKomputer);
    }

    // Overloading Method tambahLayanan (makanan)
    public void tambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan : " + makanan);
    }

    // Overloading Method tambahLayanan (makanan dan minuman)
    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan makanan : " + makanan + " dan minuman: " + minuman);
    }
}
