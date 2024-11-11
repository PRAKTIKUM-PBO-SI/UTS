/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsshahifah;

/**
 *
 * @author Shahifah Sajadiyah
 * 2311103116
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
        System.out.println("Jenis Member : " + (vipCard ? "Member VIP" : "Member Reguler"));
        if (vipCard) {
            System.out.println("Benefit Member VIP : Gratis Senyuman dari pemilik Warnet estetik");
        } else {
            System.out.println("Benefit Member Reguler :Maaf tidak ada benefit ");
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
