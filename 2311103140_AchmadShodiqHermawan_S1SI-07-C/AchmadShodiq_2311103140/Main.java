/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AchmadShodiq_2311103140;

/**
 *
 * @achmadshodiq2311103140
 */
public class Main {
    public static void main(String[] args) {
        // Output VIP di sisi kiri
        System.out.println("===== VIP SECTION (LEFT) =====");
        ComputerVIP vip = new ComputerVIP(20, "Warnet Gaming X", 5000, true);
        vip.informasi();
        vip.login("Achmad");
        vip.bermain(2);
        vip.bermain(2, 30);

        ComputerPremium premium = new ComputerPremium(5, "Warnet Gaming X", 10000, true);
        premium.informasi();
        premium.pesan(5);
        premium.tambahLayanan("Mie Goreng");
        premium.tambahLayanan("Mie Goreng", "Es Teh");

        //  untuk membedakan sisi kiri vip dan kanan non vip
        System.out.println("\n\n===== NON-VIP SECTION (RIGHT) =====");
        
        // Output non-VIP di sisi kanan
        ComputerVIP nonVip = new ComputerVIP(15, "Warnet Gaming X", 7000, false);
        nonVip.informasi();
        nonVip.login("Achmad");
        nonVip.bermain(2);
        nonVip.bermain(2, 3);

        ComputerPremium nonPremium = new ComputerPremium(5, "Warnet Gaming X", 10000, false);
        nonPremium.informasi();
        nonPremium.pesan(5);
        nonPremium.tambahLayanan("Mie Goreng");
        nonPremium.tambahLayanan("Mie Goreng", "Es Teh");
    }
}