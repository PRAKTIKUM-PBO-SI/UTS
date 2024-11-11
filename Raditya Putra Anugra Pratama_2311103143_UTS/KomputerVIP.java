package com.mycompany.oop_raditya_2311103143;

/**
 * @author Raditya Putra Anugra Pratama
 * 2311103143
 * S1SI07C
 */
class KomputerVIP extends Komputer {
    protected boolean vipCard;

    // Constructor KomputerVIP
    public KomputerVIP(int jumlahkomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahkomputer,namaWarnet, hargaPerJam);
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