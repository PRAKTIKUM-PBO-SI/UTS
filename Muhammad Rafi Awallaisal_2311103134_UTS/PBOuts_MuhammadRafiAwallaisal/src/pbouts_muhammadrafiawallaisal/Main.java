/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbouts_muhammadrafiawallaisal;
// @Muhammad Rafi Awallaisal
// S1SI07C
// 231103134
public class Main {
    public static void main(String[] args) {
        
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah Komputer : 20");
        System.out.println("Nama Warnet     : Warnet Gaming X");
        System.out.println("Harga Per Jam   : Rp5000.0");
        System.out.println("\n=========================");
    // VIP User
        KomputerVIP vipUser = new KomputerVIP(15, "Warnet Gaming Paperex by Rafi", 7000.0f, true);
        System.out.println("=========================");
        vipUser.informasi();
        System.out.println("=========================");
        vipUser.login("Rafi");
        vipUser.bermain(2);
        vipUser.bermain(2, 3);
        System.out.println();

        // Premium User
        KomputerPremium premiumUser = new KomputerPremium(5, "Warnet Gaming Paperex by Rafi", 10000.0f, true);
        System.out.println("=========================");
        premiumUser.informasi();
        System.out.println("=========================");
        premiumUser.pesan(5);
        premiumUser.tambahLayanan("Ayam Bakar");
        premiumUser.tambahLayanan("Ayam Bakar", "Es Milo");
        System.out.println("\n=========================");
        
        KomputerVIP secondUser = new KomputerVIP(20, "Warnet Gaming Paperex by Rafi", 20000.0f, false);
        System.out.println("=========================");
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah Komputer : 20");
        System.out.println("Nama Warnet     : Warnet Gaming Paperex by Rafi");
        System.out.println("Harga Per Jam   : Rp5000.0");
        System.out.println("=========================");
        
        // Non-VIP User
        KomputerVIP nonVipUser = new KomputerVIP(20, "Warnet Gaming Paperex by Rafi", 8000.0f, false);
        System.out.println("=========================");
        nonVipUser.informasi();
        System.out.println("=========================");
        nonVipUser.login("Rafiggwp");
        nonVipUser.bermain(2);
        nonVipUser.bermain(2, 3);
        System.out.println();

        // Standard User
        KomputerPremium standardUser = new KomputerPremium(5, "Warnet Gaming Paperex by Rafi", 10000.0f, false);
        System.out.println("=========================");
        standardUser.informasi();
        System.out.println("=========================");
        standardUser.pesan(5);
        standardUser.tambahLayanan("Chicken Katsu");
        standardUser.tambahLayanan("Mie Goreng", "Es Jeruk");
        
        
    }
}