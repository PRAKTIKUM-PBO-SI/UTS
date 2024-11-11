/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warnet;

/**
 *
 * @author Teuku Bintang Hadi Negara
 */
abstract class Komputer {
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;
    
    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam) {
        this.jumlahKomputer = jumlahKomputer;
        this.hargaPerJam = hargaPerJam;
        this.namaWarnet = namaWarnet;
    }
    
    public void informasi() {
        System.out.println("===== Informasi Komputer =====");
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
        System.out.println("Nama Warnet: " + namaWarnet);
        System.out.println("Harga Per Jam: " + hargaPerJam);
    }
}
