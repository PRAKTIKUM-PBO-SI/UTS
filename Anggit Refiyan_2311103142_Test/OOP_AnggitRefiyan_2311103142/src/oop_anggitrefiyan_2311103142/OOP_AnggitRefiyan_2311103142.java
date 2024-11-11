/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_anggitrefiyan_2311103142;

/**
 *
 * @author Anggit Refiyan
 * 2311103142
 * 7c
 */
public class OOP_AnggitRefiyan_2311103142 {

    public static void main(String[] args) {
        System.out.println("VIP");
        KomputerVIP vip = new KomputerVIP(20,"Warnet Gaming X", 5000, true);
        vip.informasi();
        vip.login("Asep");
        vip.bermain(2);
        vip.bermain(2, 3);
        
        KomputerPremium premium = new KomputerPremium(5,"Warnet Gaming X", 10000, true);
        premium.informasi();
        premium.pesan(5);
        premium.tambahLayanan("Mie goreng");
        premium.tambahLayanan("Mie goreng","es teh");
        
        System.out.println("NON");
        KomputerVIP nonvip = new KomputerVIP(15,"Warnet Gaming X", 5000, false);
        nonvip.informasi();
        nonvip.login("Asep");
        nonvip.bermain(2);
        nonvip.bermain(2, 3);
        
        KomputerPremium nonpremium = new KomputerPremium(5,"Warnet Gaming X", 10000, false);
        nonpremium.informasi();
        nonpremium.pesan(5);
        nonpremium.tambahLayanan("Mie goreng");
        nonpremium.tambahLayanan("Mie goreng","es teh");
    }
    
}
