/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warnet;

/**
 *
 * @author Teuku Bintang hadi Negara
 */
class KomputerVIP extends Komputer {
    protected boolean vipCard;
    
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    
    @Override
    public void informasi() {
        if(vipCard){
            super.informasi();
            System.out.println("Status: MemberVIP");
            System.out.println("");
            System.out.println("Benefit Member VIP:");
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputer gaming"); 
        }else {
            super.informasi();
            System.out.println("Status: Non VIP");
            System.out.println("");
            System.out.println("Benefit Member VIP: jgn ngarep benefit, maav :) ");
        }
    }
    
    public void login(String username) {
        System.out.println("");
        System.out.println("Login dengan username: " + username);
    }
    
    public void bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam");
    }
    
    public void bermain(int jam, int menitTambahan) {
        System.out.println("Nambah billing selama " + jam + " jam " + menitTambahan + " menit");
        System.out.println("");
    }
    
}