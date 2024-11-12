
/**
 *
 * @author Levina
 */
class komputerVIP extends komputer {
    protected boolean vipCard;
    
    public komputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
    }
    
    @Override
    public void informasi(){
        System.out.println("=============================================");
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah Komputer : " +jumlahKomputer);
        System.out.println("Nama Warnet     : " +namaWarnet);
        System.out.println("Harga Per Jam   : " +hargaPerJam);
        System.lineSeparator();
        
        System.out.println("Benefit Member VIP:");
        if (vipCard) {
            System.out.println("Status      : Member VIP");
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputer gaming");
        }else{
            System.out.println("Status      : Non VIP");
            System.out.println("Tidak ada benefitnya <3 ");
        }
    }
    
    public void login(){
        System.out.println("Login dengan username: Asep");
    }
    
    public void bermain(){
        System.out.println("Bermain selama 2 jam");
    }
    
    public void bermain(int jam, int menitTambahan){
        System.out.println("Nambah billing selama 2 jam 3 menit");
    }
}