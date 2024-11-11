/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Najwa Darmawan
 * 2311103108
 * S1SI07C
 */
    public class KomputerVIP extends Komputer {
    protected boolean vipCard;

    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println(" Jenis Member Anda : " + (vipCard ? " Member VIP " : " Member Reguler ")); if(vipCard){
    
        System.out.println(" Keuntungan Member VIP : Akses prioritas & Diskon 10% ");
    }else{
        System.out.println(" Tidak ada keuntungan khusus Member Reguler " );
         }
    }

    public void login(String username) {
        System.out.println(" Anda Login dengan username : " + username); 
         }
    public void bermain(int jam) {
        System.out.println(" Billing selama " + jam +  " jam "); 
         }
    public void bermain(int jam, int menitTambahan) {
        System.out.println(" Billing selama " + jam +  " jam dan " + menitTambahan + " menit "); 
         }
    }



