package UTSGeo2311103112;

/**
 *
 * @author Geordy Sipho Samuel Damanik
 * S1SI-07-C
 * 2311103112
 */
public class KomputerVIP extends Komputer {
    protected boolean vipCard;

    // Konstruktor dengan 4 parameter
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam); // Memanggil konstruktor superclass
        this.vipCard = vipCard; // Menginisialisasi atribut vipCard
    }

    @Override
    public void informasi() {
        super.informasi(); // Memanggil metode informasi dari superclass
        System.out.println("Status VIP: " + (vipCard ? "VIP" : "Non VIP")); // Menampilkan status VIP
    }

    public void login(String username) {
        System.out.println("Login Username: " + username);
    }

    public void bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam");
    }

    public float menuTambahan(float tambahan) {
        return hargaPerJam + tambahan;
    }
}