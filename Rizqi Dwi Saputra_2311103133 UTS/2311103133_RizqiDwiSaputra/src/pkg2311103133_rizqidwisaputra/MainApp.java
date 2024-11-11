package pkg2311103133_rizqidwisaputra;
//Rizqi Dwi Saputra_2311103133_S1SI07C

public class MainApp {

    public static void main(String[] args) {
        
        System.out.println("INFORMASI KOMPUTER: ");
        System.out.println("Jumlah Komputer : 20");
        System.out.println("Nama Warnet : Warnet Gaming X");
        System.out.println("Harga per Jam   : Rp.5000.0");
        System.out.println("");
        System.out.println("============================");
        System.out.println("");
        
        
        KomputerVIP vip = new KomputerVIP(15, "Warnet Gaming X", 7000, true);
        vip.Informasi();
        System.out.println("");
        
        vip.login("Asep");
        vip.bermain(2);
        vip.bermain(2, 3);
        
        System.out.println("");
        System.out.println("============================");
        
        KomputerPremium prem = new KomputerPremium(5, "Warnet Gaming X", 10000, false);
        prem.Informasi();
        System.out.println("");
        
        prem.pesan(5);
        prem.tambahLayanan("Mie Goreng");
        prem.tambahLayanan("Mie Goreng", "Es Teh");
        
    }
    
}
