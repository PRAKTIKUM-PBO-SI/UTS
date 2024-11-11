package UTSGeo2311103112;
/**
 *
 * @author Geordy Sipho Samuel Damanik
 * S1SI-07-C
 * 2311103112
 */
public class UtsPBOGeordy {
    public static void main(String[] args) {
        System.out.println("INFORMASI KOMPUTER:");
        Komputer komputer1 = new Komputer(1, "Warnet DCW", 45000.0f);
        komputer1.informasi();
        System.out.println("------------------------");

        System.out.println("INFORMASI KOMPUTER:");
        KomputerVIP komputerVIP = new KomputerVIP(15, "Warnet DCW", 45000.0f, true);
        komputerVIP.informasi();
        if (komputerVIP.vipCard) {
            System.out.println("Benefit member VIP:");
            System.out.println("* Gratis bermain di atas 3 jam");
            System.out.println("* Gratis minuman setiap 2 jam bermain");
            System.out.println("* Gratis Warnet DCW member");
        } else {
            System.out.println("Status\t\t: Non VIP");
            System.out.println("Benefit member VIP: Join ngga benefit, yuuu :)");
        }
        komputerVIP.login("Geordy");
        System.out.println("------------------------");

        System.out.println("INFORMASI KOMPUTER:");
        KomputerPremium komputerPremium = new KomputerPremium(5, "Warnet DCW", 45000.0f, true);
        komputerPremium.informasi();
        if (komputerPremium.ruangPrivat) {
            System.out.println("Fasilitas Ruang Premium:");
            System.out.println("* Free AC Pribadi");
            System.out.println("* Ruangan kedap suara");
            System.out.println("* Komputer spesifikasi tinggi");
            System.out.println("* Koneksi internet dedicated 100Mbps");
        }
        System.out.println("\nPemesanan komputer nomor    : 5");
        komputerPremium.tambahLayanan("Nasi Goreng");
        komputerPremium.tambahLayanan("Nasi Goreng", "Es Teh");

        System.out.println("\nINFORMASI KOMPUTER:");
        Komputer komputer2 = new Komputer(1, "Warnet DCW", 45000.0f);
        komputer2.informasi();
        System.out.println("------------------------");

        System.out.println("INFORMASI KOMPUTER:");
        KomputerVIP komputerNoVIP = new KomputerVIP(15, "Warnet DCW", 45000.0f, false);
        komputerNoVIP.informasi();
        if (komputerNoVIP.vipCard) {
            System.out.println("Benefit member VIP:");
            System.out.println("* Gratis bermain di atas 3 jam");
            System.out.println("* Gratis minuman setiap 2 jam bermain");
            System.out.println("* Gratis Warnet Gaming X member");
        } else {
            System.out.println("Status\t\t: Non VIP");
            System.out.println("Benefit member VIP: Join ngga benefit, yuuu :)");
        }
        komputerNoVIP.login("Geordy");
        System.out.println("Tambah billing selama 2 jam 3 menit");
        System.out.println("------------------------");

        System.out.println("INFORMASI KOMPUTER:");
        KomputerPremium komputerStandar = new KomputerPremium(5, "Warnet DCW", 45000.0f, false);
        komputerStandar.informasi();
        if (komputerStandar.ruangPrivat) {
            System.out.println("Fasilitas Ruang Premium:");
            System.out.println("* Free AC Pribadi");
            System.out.println("* Ruangan kedap suara");
            System.out.println("* Komputer spesifikasi tinggi");
            System.out.println("* Koneksi internet dedicated 100Mbps");
        } else {
            System.out.println("Status\t\t: Ruangan Standar");
            System.out.println("Fasilitas Ruangan Standar:");
            System.out.println("* Ruangan gerah");
            System.out.println("* Suhu matahari");
            System.out.println("* Komputer spesifikasi rendah");
            System.out.println("* Koneksi internet dedicated 1Mbps");
        }
        System.out.println("\nPemesanan komputer nomor    : 5");
        komputerStandar.tambahLayanan("Nasi Goreng");
        komputerStandar.tambahLayanan("Nasi Goreng dan Minuman Es Teh");
    }
}