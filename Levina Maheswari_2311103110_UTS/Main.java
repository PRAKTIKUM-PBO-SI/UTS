
public class Main {
public static void main(String[] args) { 
    System.out.println("INFORMASI KOMPUTER : ");
    System.out.println("Jumlah Komputer : 20");
    System.out.println("Nama Warnet	: Warnet Gaming X"); 
    System.out.println("Harga Per Jam   : Rp.5000.0");
       System.lineSeparator();
    
    komputerVIP vip = new komputerVIP (15, "Warnet Gaming X", 7000); 
    vip.informasi();
    vip.login(); 
    vip.bermain(); 
    vip.bermain(2, 3);
    
    komputerPremium premium = new komputerPremium (5, "Warnet Gaming X", 10000); 
    premium.informasi();
    premium.pesan(); 
    premium.tambahLayanan();
    premium.tambahLayanan("mie goreng", "es teh");



}
}


