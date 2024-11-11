package uts_tegarfrdian;

/**
 *
 * @author Tegar Ferdian (2311103123)
 */
public class Main {
    public static void main(String[] args) {
        // Contoh output ketika user mempunyai VIP Card dan menggunakan Ruang Privat
        System.out.println("=====  Member VIP Card dan Ruang Privat =====");
        KomputerVIP komputerVIP = new KomputerVIP(30, "Warnet Tel-u", 10000, true);
        komputerVIP.informasi();
        komputerVIP.login("Tegar Ferdian");
        komputerVIP.bermain(2);
        komputerVIP.bermain(3, 3);
        System.out.println();

        KomputerPremium komputerPremium = new KomputerPremium(20, "Warnet Tel-u", 10000, true);
        komputerPremium.informasi();
        komputerPremium.pesan(5);
        komputerPremium.tambahLayanan("Roti Cokelat");
        komputerPremium.tambahLayanan("Roti Cokelat", "Teh pucuk");

        // Contoh output ketika user tidak mempunyai VIP Card dan tidak menggunakan Ruang Privat
        System.out.println("\n===== Member Non VIP Card dan Ruang Privat =====");
        KomputerVIP komputerNonVIP = new KomputerVIP(15, "Warnet Tel-u", 10000, false);
//        komputerNonVIP.informasi();
        komputerNonVIP.login("Tegar Ferdian");
        komputerNonVIP.bermain(2);
        komputerNonVIP.bermain(3, 3);
        System.out.println();

        KomputerPremium komputerStandard = new KomputerPremium(15, "Warnet Tel-u", 10000, false);
        komputerStandard.informasi();
        komputerStandard.pesan(5);
        komputerStandard.tambahLayanan("Tango");
        komputerStandard.tambahLayanan("Tango", "Es Teh");
    }
}