/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author LENOVO
 */
public class main {

    public static void main(String[] args) {
        //objek komputer
        Komputer komputer = new Komputer(20, "Warnet Ucok", 7000);
        Komputer.tampilkanInformasi();
        System.out.println();
    }
        //objek komputerVIP
        KomputerVIP komputerVIP = new KomputerVIP(15, "Warnet Marni",  10000);
       // KomputerVIP.informasi();
       // KomputerVIP.login("userAnto");
       // KomputerVIP.bermain(5 jam);
       // KomputerVIP.menitTambahan(20);
       // System.out.println();
        
        KomputerPremium komputerPremium = new KomputerPremium(10, "Warnet Apache", 20000);
        // komputerPremium.informasi();
        // komputerPremium.pesan(5);
        // komputerPremium.menambahLayanan("Bakso");
        // komputerPremium.menambahLayanan("Bakso", "Kopi");
        
    
}
