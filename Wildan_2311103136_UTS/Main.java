/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jurnalmodul2wildan;

/**
 *
 * @author  Wildan
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Komputer
        Komputer komputer = new Komputer(10, "Warnet Gabrest", 5000.0f);
        komputer.informasi();
        System.out.println();

        // Membuat objek KomputerVIP
        KomputerVIP komputerVIP = new KomputerVIP(5, "Warnet Gabrest", 7000.0f, true);
        komputerVIP.informasi();
        komputerVIP.login("userVIP");
        komputerVIP.bermain(2);
        komputerVIP.menitTambahan(15);
        System.out.println();

        // Membuat objek KomputerPremium
        KomputerPremium komputerPremium = new KomputerPremium(3, "Warnet Gabrest", 10000.0f, true);
        komputerPremium.informasi();
        komputerPremium.pesan(1);
        komputerPremium.tambahLayanan("Snack");
        komputerPremium.tambahLayanan("Snack", "Kopi");
    }
}
