package pkg2311103133_rizqidwisaputra;
//Rizqi Dwi Saputra_2311103133_S1SI07C

public class KomputerPremium extends Komputer{
    
    private boolean ruangPrivat;
    private int nomorKomputer;
    private String makanan;
    private String minuman;
    
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    
    public void pesan(int nomorKomputer){
        this.nomorKomputer = nomorKomputer;
        System.out.println("Memesan komputer nomor  : " + nomorKomputer);
    }
    
    public void tambahLayanan(String makanan){
        this.makanan = makanan;
        System.out.println("Menambah layanan makanan    : " + makanan);
    }
    
    public void tambahLayanan(String makanan, String minuman){
        this.makanan = makanan;
        this.minuman = minuman;
        System.out.println("Menambah layanan makanan    : " + makanan + " dan Minuman: " + minuman);
    }
    
    @Override
    public void Informasi(){
        System.out.println("INFORMASI KOMPUTER: ");
        System.out.println("Jumlah Komputer : " + jumlahKomputer);
        System.out.println("Nama Warnet : " + namaWarnet);
        System.out.println("Harga Per Jam   : Rp." + hargaPerJam);
        
        if(ruangPrivat == true){
            System.out.println("Status  : Ruangan Premium");
            System.out.println("");
            System.out.println("Fasilitas Ruang Premium: ");
            System.out.println("- Ruangan ber-AC pribadi");
            System.out.println("- Sofa gaming exclusive");
            System.out.println("- Komputer spesifikasi tinggi");
            System.out.println("- Koneksi internet dedicated 100mbps");
        }else{
            System.out.println("Status  : Ruangan Standar");
            System.out.println("");
            System.out.println("Fasilitas Ruang Standar: ");
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa majapahit");
            System.out.println("- Komputer spesifikasi rendah");
            System.out.println("- Koneksi internet dedicated 1mbps");
        }
    }
    
}
