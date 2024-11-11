/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rhojayalfirdaus2311103121;

/**
 *
 * @author Rhojay Alfirdaus
 */

    
public class KomputerGame extends Komputer {
    protected boolean vipCard;

    public KomputerGame(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status          : " + (vipCard ? "Member VIP" : "Non VIP"));
        System.out.println("Benefit Member VIP:");
        if (vipCard) {
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputer gaming");
        } else {
            System.out.println("- Tidak ada benefit, maaf :)");
        }
    }

    public void login(String username) {
        System.out.println("\nLogin dengan username: " + username);
    }

    public void bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam");
    }

    public void bermain(int jam, int menitTambahan) {
        System.out.println("Menambah billing selama " + jam + " jam " + menitTambahan + " menit");
    }
}

