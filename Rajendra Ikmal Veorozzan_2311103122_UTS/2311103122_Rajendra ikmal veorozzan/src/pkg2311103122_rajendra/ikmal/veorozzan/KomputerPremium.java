/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2311103122_rajendra.ikmal.veorozzan;

 // RAJENDRA IKMAL VEOROZZAN

public class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;

    public KomputerPremium(int jumlah, String nama, float harga, boolean privat) {
        super(jumlah, nama, harga);
        this.ruangPrivat = privat;
    }

    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        if (ruangPrivat) {
            System.out.println("Status           : Ruangan Premium\n");
            System.out.println("Fasilitas Ruang Premium:");
            System.out.println("- Ruangan ber-AC pribadi");
            System.out.println("- Sofa gaming exclusive");
            System.out.println("- Komputer spesifikasi tinggi");
            System.out.println("- Koneksi internet dedicated 100Mbps\n");
        } else {
            System.out.println("Status           : Ruangan Standar\n");
            System.out.println("Fasilitas Ruang Standar:");
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa majapahit");
            System.out.println("- Komputer spesifikasi rendah");
            System.out.println("- Koneksi internet dedicated 1Mbps\n");
        }
    }

    public void pesanKomputer(int nomor) {
        System.out.println("Memesan komputer nomor  : " + nomor);
    }

    public void tambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan : " + makanan);
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan makanan : " + makanan + " dan minuman: " + minuman);
    }
}

