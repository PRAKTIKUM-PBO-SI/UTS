/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1_7c_2311103137_ardzarichorevansyah;

/**
 *
 *  @author ARDZARICHO REVANSYAH
 * 2311103137
 * 07C 
 */
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
        System.out.println("Nama Pakaian: " + nama);
        System.out.println("Jumlah Stok: " + jumlah);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Jenis: " + jenis);
        System.out.println("Atribut Tambahan: " + atributTambahan);
        System.out.println("----------------------------");
    }
}

