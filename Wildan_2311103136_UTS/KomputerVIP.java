/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul2wildan;

/**
 *
 * @author Wildan
 */

public class KomputerVIP extends Komputer {
    protected boolean vipCard;

    // Constructor
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    // Overriding Method informasi
    @Override
    public void informasi() {
        super.informasi();
        System.out.println("VIP Card: " + (vipCard ? "Tersedia" : "Tidak Tersedia"));
    }

    // Method login
    public void login(String username) {
        System.out.println("User " + username + " has logged in.");
    }

    // Method bermain
    public void bermain(int jam) {
        System.out.println("User bermain selama " + jam + " jam.");
    }

    // Method menitTambahan
    public void menitTambahan(int menitTambahan) {
        System.out.println("Menit tambahan: " + menitTambahan + " menit.");
    }
}   

