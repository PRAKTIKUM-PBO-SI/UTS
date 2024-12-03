package ManajemenPakaian;
/*@author Zoe Satrian / 2311103141 */

public class Pakaian {
    
    private String nama;
    private int jumlah;
    private double harga;
    private String jenis;
    private String atributTambahan;

    public Pakaian(String nama, int jumlah, double harga, String jenis, String atributTambahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.jenis = jenis;
        this.atributTambahan = atributTambahan;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Jenis: " + jenis);
        System.out.println("Atribut Tambahan: " + atributTambahan);
        System.out.println("--------------------------");
    }
}