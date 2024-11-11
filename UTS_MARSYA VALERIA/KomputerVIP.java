/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsmarsya;

/**
 *
 * @author Marsya Valeria
 * 2311103105
 * 07C
 */
public class KomputerVIP extends Komputer{
    protected boolean vipCard;

    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Jenis Member : " + (vipCard ? "Member VIP" : "Member Reguler"));
        if (vipCard) {
            System.out.println("Benefit Member VIP : Akses prioritas dan diskon 10% untuk bermain 3 jam,"
                    + "Geratis minuman setiap 4 jam bermain, prioritas booking komputer gaming  ");
        } else {
            System.out.println("Benefit Member Reguler : Tidak Ada Benefit");
        }
    }

    public void login(String username) {
        System.out.println("Login dengan username : " + username);
    }
    
    public void bermain(int jam) {
        System.out.println("Billing selama " + jam + " jam");
    }

    public void bermain(int jam, int menitTambahan) {
        System.out.println("Billing selama " + jam + " jam dan " + menitTambahan + " menit");
    }
}