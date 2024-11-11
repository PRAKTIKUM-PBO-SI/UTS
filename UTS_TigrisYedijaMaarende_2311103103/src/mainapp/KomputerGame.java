/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

/**
 *
 * @author Tigris Yedija Maarende
 * 2311103103
 */
class KomputerGame extends Komputer {
    protected boolean aksesGamePass;

    public KomputerGame(int totalKomputer, String namaCafe, float tarifPerJam, boolean aksesGamePass) {
        super(totalKomputer, namaCafe, tarifPerJam);
        this.aksesGamePass = aksesGamePass;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Akses Game Pass: " + (aksesGamePass ? "Tersedia" : "Tidak Tersedia"));
    }

    public void masukGame(String username) {
        System.out.println("Pemain " + username + " telah masuk ke sesi game.");
    }

    public void durasiMain(int jam) {
        System.out.println("Durasi bermain: " + jam + " jam.");
    }

    public void tambahDurasi(int tambahanMenit) {
        System.out.println("Durasi tambahan: " + tambahanMenit + " menit.");
    }
}


s