/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Najwa Darmawan
 * 2311103108
 * S1SI07C
 */
public class MainUts {
    public static void main(String[] args) {
        System.out.println("===== Contoh 1: Member dengan VIP Card dan Ruang Privat =====");
        KomputerVIP komputerVIP = new KomputerVIP(10, " Warnet Najwa Cantik ", 5000.0f, true);
        komputerVIP.informasi();
        komputerVIP.login(" Putri ");
        komputerVIP.bermain(2);
        komputerVIP.bermain(2, 20);

        System.out.println();

        KomputerPremium komputerPremium = new KomputerPremium(10, " Warnet Najwa Cantik ", 5000.0f, true);
        komputerPremium.informasi();
        komputerPremium.pesan(5);
        komputerPremium.tambahLayanan("Nasi Goreng");
        komputerPremium.tambahLayanan("Nasi Goreng", "Es Campur");

        System.out.println("\n===== Contoh 2: Member tanpa VIP Card dan tanpa Ruang Privat =====");
        
        KomputerVIP komputerVIPNonMember = new KomputerVIP(10, " Warnet Najwa Cantik ", 5000.0f, false);
        komputerVIPNonMember.informasi();
        komputerVIPNonMember.login(" Dinda ");
        komputerVIPNonMember.bermain(2);

        System.out.println();

        KomputerPremium komputerPremiumNonPrivat = new KomputerPremium(10, " Warnet Najwa Cantik ", 5000.0f, false);
        komputerPremiumNonPrivat.informasi();
        komputerPremiumNonPrivat.pesan(2);
        komputerPremiumNonPrivat.tambahLayanan("Ayam Goreng");
        komputerPremiumNonPrivat.tambahLayanan("Ayam Goreng", "Es Teh");
    }
}

