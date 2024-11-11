/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2311103122_rajendra.ikmal.veorozzan;

 // RAJENDRA IKMAL VEOROZZAN

public class KomputerGame extends Komputer {
    protected boolean punyaKartuVIP;

    public KomputerGame(int jumlah, String nama, float harga, boolean vip) {
        super(jumlah, nama, harga);
        this.punyaKartuVIP = vip;
    }

    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        if (punyaKartuVIP) {
            System.out.println("Status           : Member VIP");
            System.out.println("\nBenefit Member VIP:");
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputer gaming\n");
        } else {
            System.out.println("Status           : Non VIP");
            System.out.println("\nBenefit Member VIP: jgn ngarep benefit, maav :)\n");
        }
    }

    public void login(String namaPengguna) {
        System.out.println("Login dengan username: " + namaPengguna);
    }

    public void bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam");
    }

    public void bermain(int jam, int menitTambahan) {
        System.out.println("Nambah billing selama " + jam + " jam " + menitTambahan + " menit");
    }
}


