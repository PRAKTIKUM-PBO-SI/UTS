/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2311103122_rajendra.ikmal.veorozzan;

 // RAJENDRA IKMAL VEOROZZAN

public class MainApp {
    public static void main(String[] args) {
        System.out.println("===================================");
        Komputer komputer1 = new Komputer(20, "Warnet Gaming X", 5000);
        komputer1.tampilkanInformasi();
        System.out.println("===================================\n");

        KomputerGame komputerGameVIP = new KomputerGame(15, "Warnet Gaming X", 7000, true);
        komputerGameVIP.tampilkanInformasi();
        komputerGameVIP.login("Asep");
        komputerGameVIP.bermain(2);
        komputerGameVIP.bermain(2, 3);
        System.out.println("===================================\n");

        KomputerPremium komputerPremiumVIP = new KomputerPremium(5, "Warnet Gaming X", 10000, true);
        komputerPremiumVIP.tampilkanInformasi();
        komputerPremiumVIP.pesanKomputer(5);
        komputerPremiumVIP.tambahLayanan("Mie Goreng");
        komputerPremiumVIP.tambahLayanan("Mie Goreng", "Es Teh");

        System.out.println("\n===================================");
        Komputer komputer2 = new Komputer(20, "Warnet Gaming X", 5000);
        komputer2.tampilkanInformasi();
        System.out.println("===================================\n");

        KomputerGame komputerGameNonVIP = new KomputerGame(15, "Warnet Gaming X", 7000, false);
        komputerGameNonVIP.tampilkanInformasi();
        komputerGameNonVIP.login("Asep");
        komputerGameNonVIP.bermain(2);
        komputerGameNonVIP.bermain(2, 3);
        System.out.println("===================================\n");

        KomputerPremium komputerPremiumNonVIP = new KomputerPremium(5, "Warnet Gaming X", 10000, false);
        komputerPremiumNonVIP.tampilkanInformasi();
        komputerPremiumNonVIP.pesanKomputer(5);
        komputerPremiumNonVIP.tambahLayanan("Mie Goreng");
        komputerPremiumNonVIP.tambahLayanan("Mie Goreng", "Es Teh");
    }
}