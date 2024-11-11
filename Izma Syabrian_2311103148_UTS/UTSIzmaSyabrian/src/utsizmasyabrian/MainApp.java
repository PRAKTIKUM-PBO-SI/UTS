/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsizmasyabrian;

/**
 *
 * @author Izma Syabrian
 * 2311103148
 * 07C
 */
public class MainApp {
    public static void main(String[] args) {
        
        KomputerVIP komputerVIP = new KomputerVIP(15, "Warnet Gaming Rian", 7000, true);
        KomputerPremium komputerpremium = new KomputerPremium(5, "Warnet Gaming Rian", 10000, true);
        
        System.out.println("INFORMASI KOMPUTER");
        System.out.println("Jumlah Komputer: 20");
        System.out.println("Nama Warnet    : Warnet Gaming Rian");
        System.out.println("Harga Per Jam  : Rp5000.0");
        System.out.println("");
        System.out.println("=================");
        System.out.println("");
        
        komputerVIP.informasi();
        komputerVIP.Login("riansyabrian");
        komputerVIP.Bermain(2);
        komputerVIP.Bermain(2, 3);
        System.out.println("");
        System.out.println("=================");
        System.out.println("");
        
        komputerpremium.informasi();
        komputerpremium.Pesan(5);
        komputerpremium.tambahLayanan("Mie Goreng");
        komputerpremium.tambahLayanan("Mie Goreng", "Es teh anget");
    }
}
