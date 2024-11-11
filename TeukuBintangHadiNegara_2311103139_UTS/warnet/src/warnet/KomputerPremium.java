/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warnet;

/**
 *
 * @author ASUS
 */
class KomputerPremium extends Komputer{
    protected boolean ruangPrivat;
    
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    
    @Override
    public void informasi() {
        if(ruangPrivat) {
            super.informasi();
            System.out.println("Status: + Ruangan Premium");
            System.out.println("");
            System.out.println("Fasilitas Ruang Premium");
            System.out.println("- Ruangan ber-AC pribadi");
            System.out.println("- Sofa gaming exclusive");
            System.out.println("- Komputer spesifikasi tinggi");
            System.out.println("- Koneksi internet dedicated 100Mbps");
            System.out.println("");
        }else {
            super.informasi();
            System.out.println("Status: + Ruangan Standar");
            System.out.println("");
            System.out.println("Fasilitas Ruang Standar");
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa majapahit");
            System.out.println("- Komputer spesifikasi rendah");
            System.out.println("- Koneksi internet dedicated 1Mbps");
        }
    }
    
    public void pesan(int nomorKomputer) {
        System.out.println("Memesan komputer nomor: " + nomorKomputer);
    }
    
    public void tambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan: " + makanan);
    }
    
    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan makanan: " + makanan + " dan minuman " + minuman);
    }
}
