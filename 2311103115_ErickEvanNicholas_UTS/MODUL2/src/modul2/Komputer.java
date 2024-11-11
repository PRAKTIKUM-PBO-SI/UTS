/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author Erick Evan Nicholas
 * 2311103115
 * S1SI-07C
 */
class Komputer {
    protected String namaWarnet;
    protected float hargaPerJam;
    protected int jumlahKomputer;

    public Komputer(String namaWarnet, float hargaPerJam, int jumlahKomputer) {
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
        this.jumlahKomputer = jumlahKomputer;
    }

    public void informasi() {
        System.out.println("Nama Warnet: " + namaWarnet);
        System.out.println("Harga per Jam: " + hargaPerJam);
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
    }
}
