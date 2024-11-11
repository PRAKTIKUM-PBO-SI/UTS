/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsizmasyabrian;

/**
 *
 * @author Izma Syabrian
 * 2311103148
 * 07C
 */
public class KomputerVIP extends Komputer{
    protected boolean vipCard;
    
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard){
        super (jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    
    @Override
    public void informasi(){
        System.out.println("INFORMASI KOMPUTER");
        System.out.println("Jumlah Komputer: "+jumlahKomputer);
        System.out.println("Nama Warnet    : "+namaWarnet);
        System.out.println("Harga Per Jam  : Rp"+hargaPerJam);
        if(vipCard == true){
            System.out.println("Status : Member VIP");
            System.out.println("");
            System.out.println("Benerfit Member VIP:");
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Gratis makanan setiap 8 jam bermain");
            System.out.println("- Prioritas booking komputer");
        }else{
            System.out.println("Status : non VIP");
            System.out.println("");
            System.out.println("Benerfit Member VIP:");
            System.out.println("- Tidak ada benerfit untuk member non VIP");
        }
    }
    
    public void Login(String username){
        System.out.println("Login dengan username: "+username);
    }
    
    public void Bermain(int jam){
        System.out.println("Bermain selama "+jam+" jam");
    }
    
    public void Bermain(int jam, int menitTambahan){
        System.out.println("Nambah billing selama "+jam+" jam "+menitTambahan+" menit");
    }
    
    
}
