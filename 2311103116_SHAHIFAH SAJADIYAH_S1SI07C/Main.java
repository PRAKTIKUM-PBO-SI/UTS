/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsshahifah;

/**
 *
 * @author Shahifah Sajadiyah
 * 2311103116
 * S1SI07C
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("=== Taehyung dengan VIP Card dan Ruang Privat ===");
        KomputerVIP komputerVIP = new KomputerVIP(10, "Warnet Estetik Shahifah", 15000.0f, true);
        komputerVIP.informasi();
        komputerVIP.login("Taehyung");
        komputerVIP.bermain(3);
        komputerVIP.bermain(3, 30);

        System.out.println();

        KomputerPremium komputerPremium = new KomputerPremium(10, "Warnet Estetik Shahifah", 15000.0f, true);
        komputerPremium.informasi();
        komputerPremium.pesan(5);
        komputerPremium.tambahLayanan("Burger & Pizza");
        komputerPremium.tambahLayanan("Burger & Pizza", "Jus Strawbery");

        System.out.println("\n=== Taehyung tidak VIP Card dan tidak Ruang Privat ===");
        
        KomputerVIP komputerVIPNonMember = new KomputerVIP(10, "Warnet Estetik Shahifah", 5000.0f, false);
        komputerVIPNonMember.informasi();
        komputerVIPNonMember.login("Taehyung");
        komputerVIPNonMember.bermain(2);

        System.out.println();

        KomputerPremium komputerPremiumNonPrivat = new KomputerPremium(10, "Warnet Estetik Shahifah", 5000.0f, false);
        komputerPremiumNonPrivat.informasi();
        komputerPremiumNonPrivat.pesan(2);
        komputerPremiumNonPrivat.tambahLayanan("Ayam Geprek");
        komputerPremiumNonPrivat.tambahLayanan("Ayam Geprek", "Es Jeruk");
    }
}
