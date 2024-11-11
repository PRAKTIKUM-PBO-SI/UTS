/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riska.vany.dewi_2311103111;

/**
 *
 * @author ASUS
 */
class KomputerVIP extends Komputer {
    protected boolean vipCard;
    
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
    }
    
    @Override
    public void informasi(){
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah Komputer : " +jumlahKomputer);
        System.out.println("Nama Warnet     : " +namaWarnet);
        System.out.println("Harga Per Jam   : " +hargaPerJam);
        System.lineSeparator();
        
        System.out.println("Benefit Member VIP:");
        if (vipCard) {
            System.out.println("Status      : Member VIP");
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputer gaming");
        }else{
            System.out.println("Status      : Non VIP");
            System.out.println("Maaf, tidak ada benefit");
        }
    }
    
    public void login(){
        System.out.println("Login dengan username: Asep");
    }
    
    public void bermain(){
        System.out.println("Bermain selama 2 jam");
    }
    
    public void bermain(int jam, int menitTambahan){
        System.out.println("Nambah billing selama 2 jam 3 menit");
    }
}
