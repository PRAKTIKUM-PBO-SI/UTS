/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsmarsya;

/**
 *
 * @author MARSYA VALERIA
 * 2311103105
 * 07C
 */
public class Main {
    public static void main(String[] args) {
      
        System.out.println("=== Member dengan VIP Card dan Ruang Privat ===");
        KomputerVIP komputerVIP = new KomputerVIP(10, "Warnet Gaming MV", 5000.0f, true);
        komputerVIP.informasi();
        komputerVIP.login("Carlos");
        komputerVIP.bermain(4);
        komputerVIP.bermain(4, 40);

        System.out.println();

        KomputerPremium komputerPremium = new KomputerPremium(10, "Warnet Gaming MV", 5000.0f, true);
        komputerPremium.informasi();
        komputerPremium.pesan(5);
        komputerPremium.tambahLayanan("Sate Kambing");
        komputerPremium.tambahLayanan("Sate Kambing", "Es Teh");

        System.out.println("\n=== Member tanpa VIP Card dan tanpa Ruang Privat ===");
        
        KomputerVIP komputerVIPNonMember = new KomputerVIP(10, "Warnet Gaming MV", 5000.0f, false);
        komputerVIPNonMember.informasi();
        komputerVIPNonMember.login("Becca");
        komputerVIPNonMember.bermain(2);

        System.out.println();

        KomputerPremium komputerPremiumNonPrivat = new KomputerPremium(10, "Warnet Gaming MV", 5000.0f, false);
        komputerPremiumNonPrivat.informasi();
        komputerPremiumNonPrivat.pesan(2);
        komputerPremiumNonPrivat.tambahLayanan("Salad Buah");
        komputerPremiumNonPrivat.tambahLayanan("Salad Buah", "Es Lemon");
    }
}