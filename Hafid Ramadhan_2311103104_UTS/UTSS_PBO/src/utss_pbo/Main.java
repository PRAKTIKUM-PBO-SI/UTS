/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utss_pbo;

/**
 * @author Hafid Ramadhan 2311103104
 */
// Class MainApp sebagai program utama
public class Main {
    public static void main(String[] args) {
        // objek untuk komputer biasa
        Komputer komputer = new Komputer(20, "Warnet Gaming Bang Hafid", 5000.0f);
        komputer.informasi();
        
        System.out.println("\n===============================");
        
        // objek untuk komputer VIP
        KomputerVIP komputerVIP = new KomputerVIP(15, "Warnet Gaming Bang Hafid", 7000.0f, true);
        komputerVIP.informasi();
        
         System.out.println("\n===============================");
         
        komputerVIP.login("Ramadhan");
        komputerVIP.bermain(2);
        komputerVIP.bermain(2, 3);
        
        System.out.println("\n===============================");
        
        //objek untuk komputer Premium
        KomputerPremium komputerPremium = new KomputerPremium(5, "Warnet Gaming Bang Hafid", 10000.0f, true);
        komputerPremium.informasi();
        komputerPremium.pesan(5);
        komputerPremium.tambahLayanan("Mie Goreng");
        komputerPremium.tambahLayanan("Mie Goreng", "Es Teh");
        
        System.out.println("\n===============================");
        
        // Tambahan output untuk komputer biasa lagi
        Komputer komputerBiasa = new Komputer(20, "Warnet Gaming Bang Hafid", 5000.0f);
        komputerBiasa.informasi();
        
        System.out.println("\n===============================");
        // objek untuk komputer Non-VIP
        KomputerVIP komputerNonVIP = new KomputerVIP(15, "Warnet Gaming Bang Hafid", 7000.0f, false);
        komputerNonVIP.informasi();
        komputerNonVIP.login("Ramadhan");
        komputerNonVIP.bermain(2);
        komputerNonVIP.bermain(2, 3);
        
        System.out.println("\n===============================");
        // objek untuk komputer Standard Room
        KomputerPremium komputerStandard = new KomputerPremium(5, "Warnet Gaming Bang Hafid", 10000.0f, false);
        komputerStandard.informasi();
        komputerStandard.pesan(5);
        komputerStandard.tambahLayanan("Mie Goreng");
        komputerStandard.tambahLayanan("Mie Goreng", "Es Teh");
        System.out.println("===============================");
    }
}
