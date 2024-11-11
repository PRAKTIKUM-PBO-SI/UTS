package pkg2311103133_rizqidwisaputra;
//Rizqi Dwi Saputra_2311103133_S1SI07C

public class KomputerVIP extends Komputer{
    
    private boolean vipCard;
    private String username;
    private int jam;
    private int menitTambahan;
    
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    
    public void login(String username){
        this.username = username;
        
        System.out.println("Login dengan username : " + username);
    }
    
    public void bermain(int jam){
        this.jam = jam;
        
        System.out.println("Bermain selama " + jam + " jam");
    }
    
    public void bermain(int jam, int menitTambahan){
        this.jam = jam;
        this.menitTambahan = menitTambahan;
        
        System.out.println("Nambah billing selama " + jam + " jam " + menitTambahan + " menit");
    }
    
    @Override
    public void Informasi(){
        System.out.println("INFORMASI KOMPUTER: ");
        System.out.println("Jumlah Komputer : " + jumlahKomputer);
        System.out.println("Nama Warnet : " + namaWarnet);
        System.out.println("Harga Per Jam   : Rp." + hargaPerJam);
        
        if(vipCard == true){
            System.out.println("Status  : Member VIP");
            System.out.println("");
            System.out.println("Benefit Member VIP:");
            System.out.println("- Diskon 10% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputer gaming");
        }else{
            System.out.println("Status  : Non VIP");
            System.out.println("Benefit Member VIP: jangan ngarep benefit maaf :)");
            System.out.println("Penanggung Jawab : Putra ganteng bgt");
        }
    }
    
    
    
}
