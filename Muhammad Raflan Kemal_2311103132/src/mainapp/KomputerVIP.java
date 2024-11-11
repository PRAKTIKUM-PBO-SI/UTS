/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

/**
 *
 * @author Muhammad Raflan Kemal 
 * 2311103132 
 * 07C
 */
class KomputerVIP extends Komputer {
    protected boolean vipCard;

    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status : " + (vipCard ? "Member VIP" : "Non VIP"));
        if (vipCard) {
            System.out.println("Benefit Member VIP :");
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 2 jam");
            System.out.println("- Prioritas booking komputer gaming");
        } else {
            System.out.println("Benefit Member VIP : (jangan ngarep benefit brok yakali, MODALLL LAHH:)");
        }
    }

    public void login(String username) {
        System.out.println("Login dengan username : " + username);
    }

    public void bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam");
    }

    public void menitTambahan(int menitTambahan) {
        System.out.println("Menambah billing selama " + menitTambahan + " menit");
    }
}
