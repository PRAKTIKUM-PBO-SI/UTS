package uts_tegarfrdian;

/**
 *
 * @author Tegar Ferdian (2311103123)
 */
public class Komputer {
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;

    // Constructor
    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam) {
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }

    // Method informasi
    public void informasi() {
        System.out.println("Nama Warnet: " + namaWarnet);
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
        System.out.println("Harga per Jam: " + hargaPerJam);
    }
}
