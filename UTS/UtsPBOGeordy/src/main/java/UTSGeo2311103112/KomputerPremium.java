package UTSGeo2311103112;

/**
 *
 * @author Geordy Sipho Samuel Damanik
 * S1SI-07-C
 * 2311103112
 */
class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;
    
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    
    @Override
    public void informasi(){
        super.informasi();
    }
    
    public void pesan(String nomorKomputer){
        System.out.println("Pemesanan komputer nomor: " + nomorKomputer);
    }
    
    public void tambahLayanan(String makanan){
        System.out.println("Tambahan Layanan makanan : " + makanan);
    }
    
    public void tambahLayanan(String makanan, String minuman){
        System.out.println("Tambahan Layanan makanan dan minuman : "+ makanan +" dan "+ minuman);
    
    }
}
