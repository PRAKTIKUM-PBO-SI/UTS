package uts_tegarfrdian;

/**
 *
 * @author Tegar Ferdian (2311103123)
 */
public class KomputerVIP extends Komputer {
    protected boolean vipCard;

    // Constructor
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    // Method informasi
    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status: " + (vipCard ? "Member VIP" : "Non VIP"));
        
        if (vipCard) {
            System.out.println("Benefit Member VIP:");
            System.out.println("- Diskon 10% untuk bermain di atas 2 jam");
            System.out.println("- Gratis minuman setiap 3 jam bermain");
            System.out.println("- Prioritas booking komputer");
            System.out.println("- Mendapatkan karcis main warnet gratis jika "
                    + " bermain 3 jam selama 3 hari");
        }
    }

    // Method login
    public void login(String username) {
        System.out.println("Login dengan username: " + username);
    }

    // Overloading bermain method
    public void bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam");
    }

    public void bermain(int jam, int menitTambahan) {
        System.out.println("Menambah billing selama " + jam + " jam " + menitTambahan + " menit");
    }
}
