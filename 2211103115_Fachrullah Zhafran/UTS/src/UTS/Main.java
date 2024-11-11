/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        Komputer komputer = new Komputer(20, "Warnet Gaming X", 5000.0f);
        komputer.informasi();
        System.out.println();
        KomputerVIP komputerVIP = new KomputerVIP(15, "Warnet Gaming X", 7000.0f, true);
        komputerVIP.informasi();
        komputerVIP.login("Asep");
        komputerVIP.bermain(2);
        komputerVIP.bermain(2, 3);
        
        System.out.println();
        KomputerVIP komputerNonVIP = new KomputerVIP(10, "Warnet Gaming X", 7000, false);
        komputerNonVIP.informasi();
        komputerNonVIP.bermain(2);
        komputerNonVIP.bermain(2, 3);

        System.out.println();
        KomputerPremium komputerPremium = new KomputerPremium(5, "Warnet Gaming X", 10000.0f, true);
        komputerPremium.informasi();
        komputerPremium.pesan(5);
        
        komputerPremium.tambahLayanan("Mie Goreng");
        komputerPremium.tambahLayanan("Mie Goreng", "Es Teh");

    }
}
