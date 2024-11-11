/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;

/**
 *
 * @author Erick Evan Nicholas
 * 2311103115
 * S1SI-07C
 */
public class MODUL2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        System.out.println("Informasi Komputer dengan status VIP dan Ruang Premium :");
        KomputerVIP komputerVIP1 = new KomputerVIP("Warnet Cihuy VIP", 8000, 10, true);
        komputerVIP1.informasi();
        komputerVIP1.login("Asep");
        komputerVIP1.bermain(2);
        komputerVIP1.bermain(2, 30);

        KomputerPremium komputerPremium1 = new KomputerPremium("Warnet Cihuy Premium", 15000, 5, true);
        komputerPremium1.informasi();
        komputerPremium1.pesan(1);
        komputerPremium1.tambahLayanan("Burger");
        komputerPremium1.tambahLayanan("Pizza", "Coca-Cola");

        System.out.println("\n-------------------------------------\n");

        System.out.println("Informasi Komputer status NON VIP dan Ruangan Standart :");
        KomputerVIP komputerVIP2 = new KomputerVIP("Warnet Cihuy VIP", 8000, 10, false);
        komputerVIP2.informasi();
        komputerVIP2.login("Asep");
        komputerVIP2.bermain(2);
        komputerVIP2.bermain(2, 30);

        KomputerPremium komputerPremium2 = new KomputerPremium("Warnet Cihuy Premium", 15000, 5, false);
        komputerPremium2.informasi();
        komputerPremium2.pesan(1);
        komputerPremium2.tambahLayanan("Burger");
        komputerPremium2.tambahLayanan("Pizza", "Coca-Cola");
    }
}