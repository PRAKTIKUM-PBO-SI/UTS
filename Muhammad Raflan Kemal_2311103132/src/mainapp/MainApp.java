/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainapp;

/**
 *
 * @author Muhammad Raflan Kemal 
 * 2311103132 
 * 07C
 */
public class MainApp {

    public static void main(String[] args) {
        System.out.println("=== Output dengan VIP Card dan Ruang Privat ===");
        KomputerVIP komputerVIP = new KomputerVIP(20, "Sentinel Cyber Arena", 10000.0f, true);
        komputerVIP.informasi();
        komputerVIP.login("Kemal");
        komputerVIP.bermain(2);
        komputerVIP.menitTambahan(3);
        System.out.println();

        KomputerPremium komputerPremium = new KomputerPremium(5, "Sentinel Cyber Arena", 25000.0f, true);
        komputerPremium.informasi();
        komputerPremium.pesan(1);
        komputerPremium.tambahLayanan("Mac and Cheese");
        komputerPremium.tambahLayanan("Mac and Cheese", "Caramel Latte");
        System.out.println();

        System.out.println("=== Output tanpa VIP Card dan Ruang Standar ===");
        KomputerVIP komputerVIPNon = new KomputerVIP(15, "Sentinel Cyber Arena", 10000.0f, false);
        komputerVIPNon.informasi();
        komputerVIPNon.login("Kemal");
        komputerVIPNon.bermain(2);
        komputerVIPNon.menitTambahan(3);
        System.out.println();

        KomputerPremium komputerPremiumNon = new KomputerPremium(5, "Sentinel Cyber Arena", 15000.0f, false);
        komputerPremiumNon.informasi();
        komputerPremiumNon.pesan(1);
        komputerPremiumNon.tambahLayanan("Magelangan Rendang");
        komputerPremiumNon.tambahLayanan("Magelangan Rendang", "Es Teh Anget");
    }
}