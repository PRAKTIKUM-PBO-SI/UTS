/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rhojayalfirdaus2311103121;

/**
 *
 * @author Rhojay Alfirdaus
 */


  public class RhojayAlfirdaus2311103121 {
    public static void main(String[] args) {
        System.out.println("=== Komputer Game ===");
        KomputerGame komputerGameVIP = new KomputerGame(15, "Warnet Jay Gaming", 7000, true);
        komputerGameVIP.informasi();
        komputerGameVIP.login("Yanto");
        komputerGameVIP.bermain(2);
        komputerGameVIP.bermain(2, 3);

        System.out.println("\n=== Komputer Premium ===");
        KomputerPremium komputerPremium = new KomputerPremium(5, "Warnet Jay Gaming", 10000, true);
        komputerPremium.informasi();
        komputerPremium.pesan(5);
        komputerPremium.tambahLayanan("Insomie Goreng");
        komputerPremium.tambahLayanan("Indomie Goreng", "Es Teh");
    }
}
