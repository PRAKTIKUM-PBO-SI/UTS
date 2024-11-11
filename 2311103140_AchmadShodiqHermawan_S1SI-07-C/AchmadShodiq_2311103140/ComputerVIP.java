/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AchmadShodiq_2311103140;

/**
 *
 * @achmadshodiq2311103140
 */
class ComputerVIP extends Computer {
    protected boolean vipCard;

    // Constructor KomputerVIP
    public ComputerVIP(int jumlahcomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahcomputer,namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    // Overriding Method informasi
    @Override
    public void informasi() {
        super.informasi();
        if (vipCard) {
            System.out.println("Benefit Member VIP:");
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputer gaming");
        } else {
            System.out.println("Status Member: NON-VIP");
            System.out.println("Benefit Member VIP: Ijin ngarep benefit, maaf :)");
        }
        System.out.println("=================================");
    }

    // Method login
    public void login(String username) {
        System.out.println("Login dengan username: " + username);
    }

    // Overloading Method bermain (jam)
    public void bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam");
        System.out.println("Nambah billing selama " + jam + " jam");
    }

    // Overloading Method bermain (jam dan menitTambahan)
    public void bermain(int jam, int menitTambahan) {
        System.out.println("Bermain selama " + jam + " jam dan " + menitTambahan + " menit");
        System.out.println("Nambah billing selama " + jam + " jam " + menitTambahan + " menit");
    }
}
