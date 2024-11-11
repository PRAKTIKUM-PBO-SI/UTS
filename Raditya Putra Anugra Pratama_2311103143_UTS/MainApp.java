package com.mycompany.oop_raditya_2311103143;

/**
 * @author Raditya Putra Anugra Pratama
 * 2311103143
 * S1SI07C
 */
public class MainApp {

    private static Object premium;
    public static void main(String[] args) {
        // Output ketika user mempunyai VIP Card dan Ruang Privat
        KomputerVIP vip = new KomputerVIP(20, "Warnet Gaming X", 5000, true);
        vip.informasi();
        vip.login("Raditya");
        vip.bermain(2);
        vip.bermain(2, 30);

        KomputerPremium premium = new KomputerPremium(5, "Warnet Gaming X", 10000, true);
        premium.informasi();
        premium.pesan(5);
        premium.tambahLayanan("Mie Goreng");
        premium.tambahLayanan("Mie Goreng", "Es Teh");

        // Output ketika user tidak mempunyai VIP Card dan Ruang Privat
        KomputerVIP nonVip = new KomputerVIP(15, "Warnet Gaming X", 7000, false);
        nonVip.informasi();
        nonVip.login("Raditya");
        nonVip.bermain(2);
        nonVip.bermain(2, 3);

        KomputerPremium nonPremium = new KomputerPremium(5, "Warnet Gaming X", 10000, false);
        nonPremium.informasi();
        nonPremium.pesan(5);
        nonPremium.tambahLayanan("Mie Goreng");
        nonPremium.tambahLayanan("Mie Goreng", "Es Teh");
    }
}