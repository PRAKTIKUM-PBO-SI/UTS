/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package warnet;

/**
 *
 * @author Teuku Bintang Hadi Negara
 */
public class Warnet {
    public static void main(String[] args) {
        KomputerPremium kp = new KomputerPremium(5, "Warnet Gaming X", 10000.0f, false);
        KomputerVIP kv = new KomputerVIP(15, "Warnet Gaming X", 7000.0f , false); 
        
        kv.informasi();
  
        kv.login("Asep");
        kv.bermain(2);
        kv.bermain(2, 3);
        
        kp.informasi();
                  
        kp.pesan(5);
        kp.tambahLayanan("Mie Goreng");
        kp.tambahLayanan("Mie Goreng", "Es Teh");
    } 
    
}
