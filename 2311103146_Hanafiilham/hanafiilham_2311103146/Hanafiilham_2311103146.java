/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hanafiilham_2311103146;

/**
 *
 * @author hanaf
 */
public class Hanafiilham_2311103146 {

    public static void main(String[] args) {
        Komputer komputer = new Komputer(20, "Warnet Gaming X", 5000 );
        komputer.tampilkanInformasi();
        System.out.println();

        // Membuat objek KomputerVIP
        KomputerVIP komputerVIP = new KomputerVIP(5, "Warnet Beta", 7000.0f, true);
        komputerVIP.tampilkanInformasi();

        // komputerPremium
        komputerPremium komputerPremium = new komputerPremium(15, "Warnet Gaming X", 100000, true);
        komputerPremium.tampilkanInformasi();
    }
}
