package uts_tegarfrdian;

/**
 *
 * @author Tegar Ferdian (2311103123)
 */
public class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;

    // Constructor
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    // Method informasi
    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status: " + (ruangPrivat ? "Ruang Premium" : "Ruang Standar"));

        if (ruangPrivat) {
            System.out.println("Fasilitas Ruang Premium:");
            System.out.println("- Ruangan ber-AC pribadi");
            System.out.println("- Sofa nyaman");
            System.out.println("- Komputer spesifikasi tinggi");
            System.out.println("- Koneksi internet dedicated 100Mbps");
        } else {
            System.out.println("Fasilitas Ruang Standar:");
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa apa adanya");
            System.out.println("- Komputer spesifikasi rendah");
            System.out.println("- Koneksi internet dedicated 1Mbps");
        }
    }

    // Method pesan
    public void pesan(int nomorKomputer) {
        System.out.println("Memesan komputer nomor: " + nomorKomputer);
    }

    // Overloading tambahLayanan method
    public void tambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan: " + makanan);
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Menambah layanan makanan: " + makanan + " dan minuman: " + minuman);
    }
}
