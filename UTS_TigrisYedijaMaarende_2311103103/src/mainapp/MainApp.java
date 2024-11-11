/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainapp;

/**
 *
 * @author Tigris Yedija Maarende
 * 2311103103
 */
public class MainApp {
    public static void main(String[] args) {
        Komputer komputer = new Komputer(12, "Internet Cafe Alpha", 6000.0f);
        komputer.tampilkanInfo();
        System.out.println();

        KomputerGame komputerGame = new KomputerGame(6, "Internet Cafe Beta", 8000.0f, true);
        komputerGame.tampilkanInfo();
        komputerGame.masukGame("GamerElite");
        komputerGame.durasiMain(4);
        komputerGame.tambahDurasi(20);
        System.out.println();

        KomputerPremium komputerPremium = new KomputerPremium(4, "Internet Cafe Gamma", 12000.0f, true);
        komputerPremium.tampilkanInfo();
        komputerPremium.pesanRuang(2);
        komputerPremium.layananTambahan("Pisang Crispy");
        komputerPremium.layananTambahan("Steak", "Teh tarik");
    }
}
