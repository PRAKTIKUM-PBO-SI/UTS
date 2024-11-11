/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author Erick Evan Nicholas
 * 2311103115
 * S1SI-07C
 */
class KomputerVIP extends Komputer {
    protected boolean vipCard;

    public KomputerVIP(String namaWarnet, float hargaPerJam, int jumlahKomputer, boolean vipCard) {
        super(namaWarnet, hargaPerJam, jumlahKomputer);
        this.vipCard = vipCard;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("VIP Card: " + (vipCard ? "Aktif" : "Tidak Aktif"));
    }

    public void login(String username) {
        System.out.println(username + " berhasil login di Komputer Cihuy VIP.");
    }

    public void bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam di Komputer Cihuy VIP.");
    }
    public void bermain(int jam, int menitTambahan) {
        System.out.println("Bermain selama " + jam + " jam dan " + menitTambahan + " menit di Komputer Cihuy VIP.");
    }
}