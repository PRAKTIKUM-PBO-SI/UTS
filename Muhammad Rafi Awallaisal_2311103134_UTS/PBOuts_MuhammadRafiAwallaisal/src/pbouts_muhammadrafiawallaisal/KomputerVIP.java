/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbouts_muhammadrafiawallaisal;
// @Muhammad Rafi Awallaisal
// S1SI07C
// 231103134
class KomputerVIP extends Komputer {
    protected boolean vipCard;
    
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    
    @Override
    public void informasi() {
        super.informasi();
        if (vipCard) {
            System.out.println("Status: Member VIP");
            System.out.println("\nBenefit Member VIP:");
            System.out.println("- Diskon total jika bermain di atas 4 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputer premium");
        } else {
            System.out.println("Status          : Non VIP");
            System.out.println("\nBenefit Member VIP: jgn ngarep benefit, maav :)");
        }
    }

    public void login(String username) {
        System.out.println("Login dengan username: " + username);
    }

    public void bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam");
    }

    public void bermain(int jam, int menitTambahan) {
        System.out.println("Menambah billing selama " + jam + " jam " + menitTambahan + " menit");
    }
}